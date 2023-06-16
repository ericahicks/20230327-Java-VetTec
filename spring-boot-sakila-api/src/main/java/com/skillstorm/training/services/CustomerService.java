package com.skillstorm.training.services;

import com.skillstorm.training.models.Customer;

public interface CustomerService {
	
	Customer save(Customer customer);
	Customer findById(short id);
	Iterable<Customer> findBySearchCriteria(String country, String city, String postalCode);

}
