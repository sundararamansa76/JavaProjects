package com.hare.krsna.JPAHibEx.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.context.annotation.Primary;

@Entity
public class Course {
	
	@Id
	@GeneratedValue
	private Long id;
	
	protected Course() {}
	
	public Long getId() {
		return id;
	}

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course(String name)
	{
		this.name = name;
	}
}
