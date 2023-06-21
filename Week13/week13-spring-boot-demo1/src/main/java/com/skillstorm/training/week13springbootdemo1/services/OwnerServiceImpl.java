package com.skillstorm.training.week13springbootdemo1.services;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.skillstorm.training.week13springbootdemo1.models.Owner;
import com.skillstorm.training.week13springbootdemo1.repositories.OwnerRepository;

@Service
public class OwnerServiceImpl implements OwnerService{

    OwnerRepository repo;

    public OwnerServiceImpl(OwnerRepository repo) {
        this.repo = repo;
    }

    @Override
    public Iterable<Owner> findAll(Pageable p) {
        return repo.findAll(p);
    }

    @Override
    public Owner findById(int id) {
        return repo.findById(id).orElseThrow(() -> new EntityNotFoundException("No owner found with id " + id));
    }

    @Override
    public Owner save(Owner owner) {
        // do i need to check if they are creating pets?

        return repo.save(owner);
    }

    @Override
    public boolean exists(Owner owner) {
        if (owner == null)
            return false;
        else
            return repo.existsById(owner.getId());
    }
    
}
