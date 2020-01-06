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
public class Passport {
	
	@Id
	@GeneratedValue
	private Long id;
	
	protected Passport() {}
	
	public Long getId() {
		return id;
	}

	@Column(nullable=false)
	private String number;
	
	@UpdateTimestamp
	private LocalDateTime lastUpdatedDate;
	
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String name) {
		this.number = number;
	}


	@Override
	public String toString() {
		return "Passport [id=" + id + ", name=" + number + "]";
	}
	
	
}
