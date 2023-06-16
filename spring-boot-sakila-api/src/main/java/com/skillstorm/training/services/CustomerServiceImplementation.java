package com.skillstorm.training.services;

import org.springframework.stereotype.Service;

import com.skillstorm.training.models.Customer;
import com.skillstorm.training.repositories.CustomerRepository;

@Service
public class CustomerServiceImplementation implements CustomerService {
	
	private CustomerRepository repo;
	
	public CustomerServiceImplementation(CustomerRepository repo) {
		this.repo = repo;
	}

	@Override
	public Customer findById(short id) {
		return repo.findById(id).get(); // throws exception
	}


	@Override
	public Iterable<Customer> findBySearchCriteria(String country, String city,
			String postalCode) {
		return repo.findBySearchCriteria(country, city, postalCode);
	}

	@Override
	public Customer save(Customer customer) {
		return repo.save(customer);
	}

}
