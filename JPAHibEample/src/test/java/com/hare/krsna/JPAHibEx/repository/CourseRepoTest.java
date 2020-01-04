package com.hare.krsna.JPAHibEx.repository;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;
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
	void findByIdBasicTet() {
		
		logger.info("Test is starting");
		Course course = courseRepo.findById(10001l);
		assertEquals("Hare Krsna", course.getName());
		
		logger.info("Test ran successfully");
	}

	
}
