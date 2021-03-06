package com.hare.krsna.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hare.krsna.springin5steps.scope.PersonalDAO;




@Configuration
@ComponentScan
public class SpringIn5StepsCdiApp {


	//binSearch1.binarySearch(new int[] {12,4,3,5},3);

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApp.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsCdiApp.class)) {
			// BinarySearchImpl bins = applicationContext.getBean(BinarySearchImpl.class);
			PersonalDAO pDao = applicationContext.getBean(PersonalDAO.class);
			PersonalDAO pDao2 = applicationContext.getBean(PersonalDAO.class);
			LOGGER.debug("Hare Krsna");
			LOGGER.warn("HariBOL");
			LOGGER.trace("Hari Hari");
			LOGGER.info("Information.........");
			LOGGER.info("{}", pDao);
			LOGGER.info("{}", pDao.getJdbccon());

			LOGGER.info("{}", pDao2);
			LOGGER.info("{}", pDao2.getJdbccon());


		}
	}


}
