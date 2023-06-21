package com.skillstorm.training.week13springbootdemo1.services;

import java.util.Set;

import org.springframework.data.domain.Pageable;

import com.skillstorm.training.week13springbootdemo1.models.Owner;
import com.skillstorm.training.week13springbootdemo1.models.Pet;

public interface PetService {

    Set<Pet> findAllOwnerlessPets();
    Iterable<Pet> findAll(Pageable p);
	Pet findById(int id);
    Owner findOwner(int id);
	Pet save(Pet pet);
	Pet update(Pet pet);
	void deleteById(int id);
}
