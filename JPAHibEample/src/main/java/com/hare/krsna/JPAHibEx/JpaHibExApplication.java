package com.hare.krsna.JPAHibEx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hare.krsna.JPAHibEx.entity.Course;
import com.hare.krsna.JPAHibEx.repository.CourseRespository;

@SpringBootApplication
public class JpaHibExApplication implements CommandLineRunner {

	@Autowired
	private CourseRespository repo;
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(JpaHibExApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course course = repo.findById(10001l);
		LOGGER.info("Course 10001 is {}", course);
		LOGGER.info("Successfully implemented JPA with H2");
	}

}
