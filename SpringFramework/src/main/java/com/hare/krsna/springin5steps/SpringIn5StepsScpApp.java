package com.hare.krsna.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hare.krsna.springin5steps.cdi.CdiBus;
import com.hare.krsna.springin5steps.cdi.CdiBusDao;




@Configuration
@ComponentScan
public class SpringIn5StepsScpApp {


	//binSearch1.binarySearch(new int[] {12,4,3,5},3);

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScpApp.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsScpApp.class)) {

			CdiBus cdibus = applicationContext.getBean(CdiBus.class);
			CdiBusDao cDao = applicationContext.getBean(CdiBusDao.class);

			LOGGER.info("{}", cdibus);
			LOGGER.info("{}", cdibus.getCdiDao());
		}
	}


}
