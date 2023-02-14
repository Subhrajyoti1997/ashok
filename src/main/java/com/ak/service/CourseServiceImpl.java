package com.ak.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.entity.Course;
import com.ak.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepo;

	@Override
	public String upsert(Course course) {
		// TODO Auto-generated method stub
		courseRepo.save(course);
		return "success";
	}

	@Override
	public Course getCourse(int cid) {
		// TODO Auto-generated method stub
		Optional<Course> findById = courseRepo.findById(cid);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
		
	}

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return courseRepo.findAll();
	
	}

	@Override
	public String deleteCourse(int cid) {
		if(courseRepo.existsById(cid)) {
		courseRepo.deleteById(cid);
		return "delete success";
		}
		else {
			return "record not found";
		}
		
	}

}
