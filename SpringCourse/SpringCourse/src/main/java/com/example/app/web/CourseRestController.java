package com.example.app.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.entity.Course;
import com.example.app.service.ICourseService;

@RestController
@RequestMapping("/app")
public class CourseRestController {
	
	@Autowired
	ICourseService service;
	
	@PostMapping("/course")
	public boolean createCourse(@RequestBody Course c)
	{
		service.createCourse(c);
		return true;
	}
	
	@GetMapping("/course/{courseid}")
	public Course getCourseId(@PathVariable int courseid)
	{
		return service.getCourseById(courseid);
	}
	
	@GetMapping("/courseslist")
	public List<Course> getAllCourses()
	{
		return service.getAllCourses();
	}
	
	@DeleteMapping("/course/{courseid}")
	public boolean deleteCourse(@PathVariable int courseid)
	{
		return service.deleteCourseId(courseid);
	}
	
	@GetMapping("/coursename")
	public List<Course> getCourseByName(@RequestParam String cname)
	{
		return service.getCourseByName(cname);
	}
	
	@GetMapping("/courseinst")
	public List<Course> getCourseByInst(@RequestParam String instructor)
	{
		return service.getCourseByInstructor(instructor);
	}

	@GetMapping("/coursecategory")
	public List<Course> getCourseByCategory(@RequestParam String category)
	{
		return service.getCourseByCategeory(category);
	}

}
