package com.skillstorm.training.week13springbootdemo1.repositories;


import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.training.week13springbootdemo1.models.Owner;
import com.skillstorm.training.week13springbootdemo1.models.Pet;


@Repository
public interface PetRepository extends PagingAndSortingRepository<Pet, Integer>{
    @Query("SELECT p.owner FROM Pet p")
    Owner findOwner(Integer id);

    @Query("SELECT p FROM Pet p WHERE p.owner IS NULL")
    Set<Pet> findAllOwnerlessPets();
}