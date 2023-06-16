package com.skillstorm.training.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.skillstorm.training.models.Computer;

@Repository
public interface ComputerRepository extends CrudRepository<Computer, Integer>{
	// Computer is the class name with properties: id, name, parts
	// Part is the class name with properties: id, name, computer
	/*
SELECT * FROM 
computer c
  JOIN
part p ON c.computer_id = p.computer_id
	 */
	@Query("SELECT c FROM Part p JOIN p.computer c WHERE c.id = :id")
	Computer findByComputerId(@Param("id") int id);
	
}
