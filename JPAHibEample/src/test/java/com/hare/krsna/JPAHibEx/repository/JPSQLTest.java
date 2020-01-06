package com.hare.krsna.JPAHibEx.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.hare.krsna.JPAHibEx.JpaHibExApplication;
import com.hare.krsna.JPAHibEx.entity.Course;
import com.hare.krsna.JPAHibEx.repository.CourseRespository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=JpaHibExApplication.class)
class JPSQLTest{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	@Test
	public void findByIdBasicTet() {
		
		logger.info("Test is starting");
		List resultList = em.createNamedQuery("query_get_all_courses").getResultList();
			
		logger.info("Test ran successfully");
		logger.info(" { } ", resultList);
	}
	
	
	@Test
	public void findByType() {
		
		TypedQuery <Course> query = em.createNamedQuery("query_get_all_courses", Course.class);
		
		
		List<Course> listOfCrse = query.getResultList();
			
		logger.info("Test ran successfully");
		logger.info(" { } ", listOfCrse);
	}
	
	@Test
	public void jpsqlBasics() {
		
		TypedQuery <Course> query = em.createQuery("Select c from Course c where name like 'Hare Krsna'", Course.class);
		
		
		List<Course> listOfCrse = query.getResultList();
			
		logger.info("Test ran successfully");
		logger.info(" { } ", listOfCrse);
	}
	
	
	
	
}
