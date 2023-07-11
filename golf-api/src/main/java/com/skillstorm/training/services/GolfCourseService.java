package com.skillstorm.training.services;

import com.skillstorm.training.models.Course;

public interface GolfCourseService {
	
	Iterable<Course> findAll();
	
	Course save(Course course);

}
