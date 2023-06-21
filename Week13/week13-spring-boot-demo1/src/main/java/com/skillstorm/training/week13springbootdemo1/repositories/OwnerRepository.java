package com.skillstorm.training.week13springbootdemo1.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.training.week13springbootdemo1.models.Owner;

@Repository
public interface OwnerRepository extends PagingAndSortingRepository<Owner, Integer> {
    
}
