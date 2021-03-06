package com.hare.krsna.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hare.krsna.springin5steps.xml.XmlPersonalDAO;


public class SpringIn5StepsXMLCont {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLCont.class);

	//binSearch1.binarySearch(new int[] {12,4,3,5},3);

	public static void main(String[] args) {


		// ApplicationContext applicationContext =
		// SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml"))
		{
			System.out.println("APP ConteXt >>>" + applicationContext.getBeanDefinitionNames());
			XmlPersonalDAO xperDao = applicationContext.getBean(XmlPersonalDAO.class);
			LOGGER.info("Beans Loaded --> {}", (Object) applicationContext.getBeanDefinitionNames());
			LOGGER.info("Inside the xml app conte ex");
			LOGGER.info("here you go: {} " + xperDao);
		}

	}

}
