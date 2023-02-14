package com.ak.service;

import java.util.List;

import com.ak.entity.Course;

public interface CourseService {
	public String upsert(Course course);
	
	public Course getCourse(int cid);
	
	public List<Course> getAllCourse();
	
	public String deleteCourse(int cid);
}
