package com.skillstorm.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.training.models.Course;
import com.skillstorm.training.services.GolfCourseService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/golf-courses/v1")
public class GolfCourseController {
	
	@Autowired
	GolfCourseService service;
	
	@GetMapping
	public Iterable<Course> findAll() {
		return service.findAll();
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Course save(@RequestBody Course course) {
		return service.save(course);
	}

}
