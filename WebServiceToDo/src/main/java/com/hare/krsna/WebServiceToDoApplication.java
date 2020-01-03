package com.hare.krsna;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebServiceToDoApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext appCon = SpringApplication.run(WebServiceToDoApplication.class, args);
		
		for(String name: appCon.getBeanDefinitionNames())
		{
			System.out.println("Name of the bean " + name);
		}

}
}
