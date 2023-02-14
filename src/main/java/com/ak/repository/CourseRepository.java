package com.ak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ak.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
