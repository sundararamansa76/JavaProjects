package com.hare.krsna.JPAHibEx.repository;


import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hare.krsna.JPAHibEx.entity.Course;


@Repository
@Transactional
public class CourseRespository {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());	
	@Autowired
	EntityManager em;
	
	public Course findById(Long id)
	{	
		return em.find(Course.class, id);
	}
	
	public Course save(Course course)
	{
		if(course.getId() == null) {
			em.persist(course);
		}
		else
		{
			em.merge(course);
		}
		return course;
	}
	
	public void deleteById(Long id)
	{
		Course course = findById(id);
		em.remove(course);
	}
	
	public void playwithEM() {
		
		logger.info("Playe with EM Starting......");
		
		Course newCorse = new Course("Jagannath, Baladev and Subdra");
		em.persist(newCorse);
		em.flush();
		
		newCorse.setName("Jagannath Puri");
		em.flush();
		
		Course newCorse2 = new Course("Jagannath2, Baladev2 and Subdra2");
		em.persist(newCorse2);		
		em.flush();
		em.detach(newCorse2);
		
		newCorse2.setName("Jagannath Puri2");
		em.flush();
	}
	
}


