package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.app.entity.Course;
import com.example.app.repository.ICourseRepository;

public class CourseServiceImpl implements ICourseService {
	
	@Autowired
	ICourseRepository repo; 

	@Override
	public Course createCourse(Course c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		List<Course> list=(List<Course>) repo.findAll();
		return list;
	}

	@Override
	public boolean deleteCourseId(int courseid) {
		repo.deleteById(courseid);
		return true;
	}

	@Override
	public Course getCourseById(int courseid) {
		
		return repo.findById(courseid).get();
	}

	@Override
	public List<Course> getCourseByName(String cname) {
		// TODO Auto-generated method stub
		return repo.getCourseByName(cname);
	}

	@Override
	public List<Course> getCourseByInstructor(String instructor) {
		// TODO Auto-generated method stub
		return repo.getCourseByInstructor(instructor);
	}

	@Override
	public List<Course> getCourseByCategeory(String category) {
		// TODO Auto-generated method stub
		return repo.getCourseByCategeory(category);
	}

}
