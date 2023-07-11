package com.skillstorm.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.training.models.Course;

@Repository
public interface GolfRepository extends JpaRepository<Course, Integer> {

}
