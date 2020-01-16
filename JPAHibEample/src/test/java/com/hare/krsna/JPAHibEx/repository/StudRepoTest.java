package com.hare.krsna.JPAHibEx.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import javax.persistence.EntityManager;
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
import com.hare.krsna.JPAHibEx.entity.Passport;
import com.hare.krsna.JPAHibEx.entity.Student;
import com.hare.krsna.JPAHibEx.repository.CourseRespository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=JpaHibExApplication.class)
class StudRepoTest{

		private Logger logger = LoggerFactory.getLogger(this.getClass());

		@Autowired
		StudRepo repository;
		
		@Autowired
		EntityManager em;

		//Session & Session Factory
		//EntityManager & Persistence Context
		//Transaction
		
		@Test
		@Transactional
		public void someTest() {
			//Database Operation 1 - Retrieve student
			//Database Operation 2 - Retrieve passport
			//Database Operation 3 - update passport
		}

		@Test
		@Transactional
		public void retrieveStudentAndPassportDetails() {
			Student student = em.find(Student.class, 2004L);
			logger.info("student -> {}", student);
			logger.info("passport -> {}",student.getPassport());
		}
		
		@Test
		@Transactional
		public void retrievePassportAndAssociatedStudent() {
			Passport passport = em.find(Passport.class, 3004L);
			logger.info("student -> {}", passport);
			logger.info("passport -> {}",passport.getStudent());
		}
	
}
