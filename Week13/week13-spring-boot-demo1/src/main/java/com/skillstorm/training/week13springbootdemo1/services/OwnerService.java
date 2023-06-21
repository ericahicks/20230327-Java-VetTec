package com.skillstorm.training.week13springbootdemo1.services;

import org.springframework.data.domain.Pageable;

import com.skillstorm.training.week13springbootdemo1.models.Owner;
public interface OwnerService {

	// Paginate the results
	Iterable<Owner> findAll(Pageable p);

	Owner findById(int id);
	Owner save(Owner owner);
    boolean exists(Owner owner);
}
