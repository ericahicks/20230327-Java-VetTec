package com.skillstorm.training.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.training.models.CarModel;

@Repository
public interface CarModelRepository extends CrudRepository<CarModel, Long> {

}
