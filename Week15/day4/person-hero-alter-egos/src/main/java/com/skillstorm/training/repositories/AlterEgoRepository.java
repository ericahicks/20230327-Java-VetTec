package com.skillstorm.training.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.training.models.AlterEgo;

@Repository
public interface AlterEgoRepository extends PagingAndSortingRepository<AlterEgo, Long>{

}
