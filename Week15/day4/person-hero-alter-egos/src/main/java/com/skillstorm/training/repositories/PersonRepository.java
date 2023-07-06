package com.skillstorm.training.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.training.models.Person;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long>{
	
}
