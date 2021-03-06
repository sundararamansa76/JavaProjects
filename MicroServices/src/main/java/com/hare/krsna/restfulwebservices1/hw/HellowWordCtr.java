package com.hare.krsna.restfulwebservices1.hw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hare.krsna.restfulwebservices1.hw.HelloWorldBean;

@RestController
public class HellowWordCtr {
	// GET

	// URI - / hello-world
	// method - Hello World

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hari Bol!!!";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hari Hari Bol!!!");
	}

	@GetMapping(path = "/hello-world-bean/hk/{name}")
	public HelloWorldBean helloWorldPathVar(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hare Krsna %s", name));
	}

}
