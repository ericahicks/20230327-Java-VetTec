package com.skillstorm.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.training.models.Person;
import com.skillstorm.training.repositories.AlterEgoRepository;
import com.skillstorm.training.repositories.PersonRepository;


//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("/people")
public class PersonController {
	
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
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Person create(@RequestBody Person person) {
		// save the alter ego first 
		alterRepo.save(person.getAlterEgo()); // TODO put these calls to the repos in a service class
		// then save the person
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
	
	
	// Delete person (auto delets alter ego right now)

}
