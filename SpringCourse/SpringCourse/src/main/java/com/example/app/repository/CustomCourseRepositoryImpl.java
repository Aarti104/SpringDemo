package com.example.app.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.app.entity.Course;

public class CustomCourseRepositoryImpl implements CustomCourseRepository {
	
	@Autowired
	EntityManager entityManager;

	@Override
	public List<Course> getCourseByName(String cname) {
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Course where cname=:cname";
		
		Query<Course> query = session.createQuery(queryString);
		query.setString("cname", cname);
		
		List<Course>  list = (List<Course>) query.getResultList();
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Course Name Records Not In The DB");
		}
	}

	@Override
	public List<Course> getCourseByInstructor(String instructor) {
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Course where instructor=:instructor";
		
		Query<Course> query = session.createQuery(queryString);
		query.setString("instructor", instructor);
		
		List<Course>  list = (List<Course>) query.getResultList();
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Instructor Name Records Not In The DB");
		}
	}

	@Override
	public List<Course> getCourseByCategeory(String category) {
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Course where category=:category";
		
		Query<Course> query = session.createQuery(queryString);
		query.setString("category", category);
		
		List<Course>  list = (List<Course>) query.getResultList();
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Instructor Name Records Not In The DB");
		}
	}

}
