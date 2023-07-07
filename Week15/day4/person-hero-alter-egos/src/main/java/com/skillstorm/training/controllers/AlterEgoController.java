package com.skillstorm.training.controllers;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.training.models.AlterEgo;
import com.skillstorm.training.models.Person;
import com.skillstorm.training.repositories.AlterEgoRepository;
import com.skillstorm.training.repositories.PersonRepository;

@RestController
@RequestMapping("/alter-egos")
public class AlterEgoController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	EntityManager entityManager;
	
	@Autowired
	AlterEgoRepository repo;
	
	@Autowired
	PersonRepository personRepo;

	@GetMapping
	public Iterable<AlterEgo> findAll() {
		return repo.findAll();
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	@Transactional
	public AlterEgo create(@RequestBody AlterEgo e) {
		
		 // Create an AlterEgo record without the Person reference
		 Person detachedEntity = e.getPerson();
		 e.setPerson(null);
		 logger.debug("trying to persist the ego without nested person object");
		 e = entityManager.merge(e);
		 
		 // See if a Person nested object needs to be saved as well
		 if (detachedEntity == null || detachedEntity.getName() == null ) {
			 return e;
		 }
		 
		 // See if nested Person object exists in db
		 Person dbPerson = null;
		 if (detachedEntity.getId() == null || 
				 (dbPerson = entityManager.find(Person.class, detachedEntity.getId())) == null) {
			 // Create a Person record without a reference to the ego record yet
			 detachedEntity.setAlterEgo(null);
			 logger.debug("trying to persist the person without the ego object");
			 dbPerson = entityManager.merge(detachedEntity);
			 entityManager.persist(dbPerson);
			 entityManager.flush();
		 } else {
			 // Person exists so just use it as is
		 }
		 
		 // Link the db person and new ego
		 e.setPerson(dbPerson);
		 dbPerson.setAlterEgo(e);
		 
		 // Update the person in the db to link to the ego in the db
		 dbPerson = personRepo.save(dbPerson);
		 return dbPerson.getAlterEgo();
	}
	
}
