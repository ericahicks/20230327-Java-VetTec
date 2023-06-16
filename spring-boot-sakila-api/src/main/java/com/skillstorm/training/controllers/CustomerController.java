package com.skillstorm.training.controllers;

import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.training.models.Customer;
import com.skillstorm.training.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	private CustomerService service;
	
	public CustomerController(CustomerService service) {
		this.service = service;
	}
	

	
	
	
	
	
	
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED) // 201 Created instead of 200 OK
	public Customer save(@RequestBody @Valid Customer customer) {
		return service.save(customer);
	}
	
	
	
	
	
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("/{id}")
	public Customer findById(@PathVariable short id) {
		try {
			return service.findById(id);
		} catch (NoSuchElementException e) {
			return null;
		}
	}
	
	@GetMapping("/search")
	public Iterable<Customer> findBySearchParam(@RequestParam(required = false)  String country, 
			@RequestParam(required = false) String city, 
			@RequestParam(name = "postal-code", required = false) String postalCode) {
		return service.findBySearchCriteria(country, city, postalCode);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
