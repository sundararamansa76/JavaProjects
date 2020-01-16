package com.hare.krsna.JPAHibEx.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy="course")
	private List<Review> reviews = new ArrayList<Review>();
	
	@ManyToMany(mappedBy="courses")
	private List<Student> students = new ArrayList<>();
	
	public List<Student> getStudents() {
		return students;
	}

	public void addStudents(Student student) {
		this.students.add(student);
	}

	public void removeStudent(Student student) {
		this.students.remove(student);
	}
	
	public List<Review> getReivews() {
		return reviews;
	}

	public void addReivews(Review reivews) {
		this.reviews.add(reivews);
	}
	
	public void removeReviews(Review reviews) {
		this.reviews.remove(reviews);
	}

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
