package com.hare.krsna.JPAHibEx.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

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
class CourseRepoTest{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRespository courseRepo;
	
	@Test
	public void findByIdBasicTet() {
		
		logger.info("Test is starting");
		Course course = courseRepo.findById(10002l);
		assertEquals("Hare Rama", course.getName());
		
		logger.info("Test ran successfully");
	}
	
	@Test
	@DirtiesContext
	public void deleteByIdTet() {
		
		logger.info("Deletion is starting");
		courseRepo.deleteById(10002l);
		
		assertNull(courseRepo.findById(10002l));
		
		logger.info("Test ran successfully");
	}
	
	@Test
	@DirtiesContext
	public void save() {
		
		logger.info("Save Test is starting");
		Course course = courseRepo.findById(10003l);
		
		if(course !=null) {
			course.setName("Hari Hari  bol!!!");;
		courseRepo.save(course);
		}
		
		assertEquals("Hari Hari  bol!!!", course.getName());
		
		
		logger.info("Test ran successfully");
	}
	
	@Test
	@DirtiesContext
	public void playwithEM() {
		
		logger.info("Playing with EM Test is starting");
		courseRepo.playwithEM();	
		
		logger.info("Test ran successfully");
	}

	
}
