package com.example.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.app.entity.Course;

@Service
public interface ICourseService {
	
	public Course createCourse(Course c);
	public List<Course> getAllCourses();
	public boolean deleteCourseId(int courseid);
	public Course getCourseById(int courseid);
	public List<Course> getCourseByName(String cname);
	public List<Course> getCourseByInstructor(String instructor);
	public List<Course> getCourseByCategeory(String category);

}
