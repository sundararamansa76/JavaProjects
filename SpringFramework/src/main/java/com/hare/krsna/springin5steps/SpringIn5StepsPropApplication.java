package com.hare.krsna.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.hare.krsna.springin5steps.properties.SomeExtService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsPropApplication.class);

	//binSearch1.binarySearch(new int[] {12,4,3,5},3);

	public static void main(String[] args) {

		// ApplicationContext applicationContext =
		// SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsPropApplication.class)) {

			SomeExtService someExSvc = applicationContext.getBean(SomeExtService.class);
			LOGGER.info("The message from prop file " + someExSvc.returnServiceURL());
		}
	}

}
