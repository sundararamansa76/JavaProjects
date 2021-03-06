package com.hare.krsna.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hare.krsna.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan

public class SpringIn5StepsBasicApplication {


	//binSearch1.binarySearch(new int[] {12,4,3,5},3);

	public static void main(String[] args) {

		// ApplicationContext applicationContext =
		// SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsBasicApplication.class)) {
			BinarySearchImpl bins = applicationContext.getBean(BinarySearchImpl.class);
			int results = bins.binarySearch(new int[] { 12, 5, 4, 3 }, 3);
			System.out.println("REsults are :: " + results);
		}
	}

}
