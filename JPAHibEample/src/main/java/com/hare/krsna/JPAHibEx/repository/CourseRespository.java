package com.hare.krsna.JPAHibEx.repository;


import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hare.krsna.JPAHibEx.entity.Course;

@Repository
public class CourseRespository {
	
	@Autowired
	EntityManager em;
	
	public Course findById(Long id)
	{
		return em.find(Course.class, id);
	}
}
