package com.hare.krsna.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hare.rama.spring.basics.compscan.ComponentDAO;




@Configuration
@ComponentScan("com.hare.rama.spring.basics.compscan")
public class SpringIn5StepsCompScanApp {


	//binSearch1.binarySearch(new int[] {12,4,3,5},3);

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCompScanApp.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsCompScanApp.class)) {
			// BinarySearchImpl bins = applicationContext.getBean(BinarySearchImpl.class);
			ComponentDAO pDao = applicationContext.getBean(ComponentDAO.class);

			LOGGER.info("{}", pDao);
			LOGGER.info("{}", pDao.getJdbccon());
		}

	}


}
