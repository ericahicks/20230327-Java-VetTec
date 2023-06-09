package com.skillstorm.training.controllers;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.training.models.AlterEgo;
import com.skillstorm.training.models.Person;
import com.skillstorm.training.repositories.AlterEgoRepository;
import com.skillstorm.training.repositories.PersonRepository;


//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/people")
public class PersonController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	EntityManager entityManager;
	
	// TODO inject the service 
	@Autowired
	PersonRepository repo;
	
	@Autowired
	AlterEgoRepository alterRepo;

	// Get people w/ alter ego info
//	@GetMapping
//	public Page<Person> findAllByPage(@RequestParam(defaultValue = "10") int size, @RequestParam(defaultValue = "0") int page) {
//		Pageable p = PageRequest.of(page, size);
//		return repo.findAll(p);
//	}
	
	@GetMapping
	public Iterable<Person> findAll() {
		return repo.findAll();
	}
	
	// TODO Get people w/o alter ego info
	
	
	// TODO Save person w/o alter ego info
	
	// Creating person w/ alter ego info
//	@PostMapping
//	@ResponseStatus(code = HttpStatus.CREATED)
//	@Transactional // when I'm doing multiple saves/deletes/updates I want all to succeed or all to fail
//	public Person create(@RequestBody Person person) {
//		// save the alter ego first 
//		AlterEgo ego = person.getAlterEgo();
////		ego.setPerson(null);
//		ego = alterRepo.save(ego); // TODO put these calls to the repos in a service class
//		
//		// ERROR something we are getting from the frontend is NULL!!!	
//		// TODO add null checks -- right now we are depending on our frontend form validation which could be circumvented
//
//		 // Create a Person record without a reference to the ego record yet
//		 person.setAlterEgo(null);
//		 logger.debug("trying to persist the person without the ego object");
//		 
//		 // ERROR was detached entity passed to persist: com.skillstorm.training.models.Person
//		 // So use the entityMangaer.merge( ) method to attach it
//		 person = entityManager.merge(person);
//		 
//		// relink the ego and the person
//		ego.setPerson(person);
//		person.setAlterEgo(ego);
//
//		// then save the person
//		return repo.save(person);
//	}
	
	@PostMapping
	@Transactional
	@ResponseStatus(code = HttpStatus.CREATED)
	public Person save(@RequestBody Person person) {
		// save the ego first
		AlterEgo ego = alterRepo.save(person.getAlterEgo());
		person.setAlterEgo(ego);
		
		return repo.save(person);
	}
	
	// Update a person
	@PutMapping("/{id}")
	public ResponseEntity<Person> update(@RequestBody Person person, @PathVariable Long id) {
		person.setId(id);
		// create if doesn't exist
		if (repo.existsById(id)) {
			return new ResponseEntity<>(repo.save(person), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(repo.save(person), HttpStatus.CREATED);
		}
	}
	
	
	// Delete person (auto deletes alter ego right now)

}
