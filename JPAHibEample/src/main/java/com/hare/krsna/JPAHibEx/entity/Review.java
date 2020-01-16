package com.hare.krsna.JPAHibEx.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.context.annotation.Primary;

@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String rating;
	
	@ManyToOne
	private Course course;
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	protected Review() {}
	
	public Long getId() {
		return id;
	}

	
	private String description;
	
	@UpdateTimestamp
	private LocalDateTime lastUpdatedDate;
	
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Review(String rating, String description)
	{
		this.description = description;
		this.rating  = rating;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", description=" + description +  ", rating" + rating + "]";
	}
	
	
}
