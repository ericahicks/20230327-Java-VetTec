package com.skillstorm.training.week13springbootdemo1.services;

import java.util.Set;

import javax.persistence.EntityNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.skillstorm.training.week13springbootdemo1.models.Owner;
import com.skillstorm.training.week13springbootdemo1.models.Pet;
import com.skillstorm.training.week13springbootdemo1.repositories.PetRepository;

@Service
public class PetServiceImpl implements PetService {

    Logger logger = LoggerFactory.getLogger(getClass());

    PetRepository repo;

    OwnerService ownerService;

    public PetServiceImpl(PetRepository repo, OwnerServiceImpl ownerService) {
        this.repo = repo;
        this.ownerService = ownerService;
    }

    @Override
    public Set<Pet> findAllOwnerlessPets() {
        return repo.findAllOwnerlessPets();
    }

    @Override
    public Iterable<Pet> findAll(Pageable p) {
        return repo.findAll(p);
    }

    @Override
    public Owner findOwner(int id) {
        return repo.findOwner(id);
    }

    @Override
    public Pet findById(int id) {
        return repo.findById(id).orElseThrow(() -> new EntityNotFoundException("No pet found with id " + id));
    }

    @Override
    public Pet save(Pet pet) {
        return repo.save(pet);
    }

    @Override
    public Pet update(Pet pet) {
        Pet existingPet = repo.findById(pet.getId()).orElse(null);
        if (existingPet == null || pet.getOwner() == null) {
            return repo.save(pet);
        } else if (existingPet.getOwner() == null) {
            ownerService.save(pet.getOwner());
            return repo.save(pet);
        } else {
            logger.debug("Updating Pet did not work with \npet = " + pet + "\nexistingPet = " + existingPet);
            return null; // should never get here
        }
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);
    }
    
}
