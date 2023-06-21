package com.skillstorm.training.week13springbootdemo1.controllers;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.training.week13springbootdemo1.models.Owner;
import com.skillstorm.training.week13springbootdemo1.services.OwnerService;

@RestController
@RequestMapping("/owner")
public class OwnerController {
    
    private final OwnerService service;

    public OwnerController(OwnerService service) {
        this.service = service;
    }

    @GetMapping
    public Iterable<Owner> findAll(@RequestParam("page") int page, @RequestParam("size") int size) {
        Pageable p = PageRequest.of(--page, size); // change page=1 into page=0 so human-readable to zero-indexed value
        return service.findAll(p);
    }
    
}
