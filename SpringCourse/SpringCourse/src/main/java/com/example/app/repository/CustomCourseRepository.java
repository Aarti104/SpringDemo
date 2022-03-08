package com.example.app.repository;

import java.util.List;

import com.example.app.entity.Course;

public interface CustomCourseRepository {
	public List<Course> getCourseByName(String cname);
	public List<Course> getCourseByInstructor(String instructor);
	public List<Course> getCourseByCategeory(String category);

}
