package com.skillstorm.training.repositories;

//import org.springframework.data.jpa.repository.JpaRepository; // allows for query batches using flush()
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.training.models.Car;

// This is a component of type
@Repository
public interface CarRepository extends PagingAndSortingRepository<Car, Long> {

	
	// Tell Jpa to generate some more queries than the ones we are getting from CrudRepository
	Iterable<Car> findByMake(String make);
	
	Iterable<Car> findByModel(String model);
	
	Iterable<Car> findByYear(int year);
	
	Iterable<Car> findByYearAndModel(int year, String model);
	
	Car findByVin(String vin);
}
