package com.hare.krsna.JPAHibEx.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.context.annotation.Primary;

@Entity
@NamedQuery(name="query_get_all_courses", query="Select c from Course c")
@Table(name="CourseDetails")
public class Course {
	
	@Id
	@GeneratedValue
	private Long id;
	
	protected Course() {}
	
	public Long getId() {
		return id;
	}

	@Column(nullable=false)
	private String name;
	
	@UpdateTimestamp
	private LocalDateTime lastUpdatedDate;
	
	@CreationTimestamp
	private LocalDateTime createdDate;
	
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

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	
	
}
