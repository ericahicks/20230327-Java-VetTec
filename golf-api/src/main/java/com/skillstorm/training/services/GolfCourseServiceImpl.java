package com.skillstorm.training.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.training.models.Course;
import com.skillstorm.training.repositories.GolfRepository;

@Service
public class GolfCourseServiceImpl implements GolfCourseService {
	
	@Autowired
	private GolfRepository repo;

	@Override
	public Iterable<Course> findAll() {
		return repo.findAll();
	}

	@Override
	public Course save(Course course) {
		return repo.save(course);
	}

}
