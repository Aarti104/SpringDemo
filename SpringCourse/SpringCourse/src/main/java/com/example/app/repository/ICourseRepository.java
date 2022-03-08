package com.example.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.app.entity.Course;

public interface ICourseRepository extends CrudRepository<Course,Integer> ,CustomCourseRepository {

}
