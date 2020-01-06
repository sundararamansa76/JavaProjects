package com.hare.krsna.JPAHibEx.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

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
class NativeQueriesTest{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	@Test
	public void nativeQueries() {
		Query query = em.createNativeQuery("Select * from Course_Details", Course.class);
		logger.info("Test is starting");
		List resultList = query.getResultList();
			
		logger.info("Test ran successfully");
		logger.info(" { } ", resultList);
	}
	
		
	@Test
	public void nativeQueries_with_params() {
		Query query = em.createNativeQuery("Select * from Course_Details where id = :id", Course.class);
		query.setParameter("id",10002l);
		logger.info("Test is starting");
		List resultList = query.getResultList();
			
		logger.info("Test ran successfully");
		logger.info(" { } ", resultList);
	}
	
	@Test
	@Transactional
	public void updateDate() {
		Query query = em.createNativeQuery("Update COURSE set last_updated_date=sysdate()", Course.class);
		logger.info("Test is starting");
		
			
		int noOfRowsUpdated = query.executeUpdate();

		logger.info("ROWS UDPATED: :: { }", noOfRowsUpdated);
		
	}
	
	
}
