package com.hare.krsna.JPAHibEx.repository;


import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hare.krsna.JPAHibEx.entity.Passport;
import com.hare.krsna.JPAHibEx.entity.Student;


@Repository
@Transactional
public class StudRepo {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());	
	@Autowired
	EntityManager em;
	
	public Student findById(Long id)
	{	
		return em.find(Student.class, id);
	}
	
	public Student save(Student student)
	{
		if(student.getId() == null) {
			em.persist(student);
		}
		else
		{
			em.merge(student);
		}
		return student;
	}
	
	public void deleteById(Long id)
	{
		Student student = findById(id);
		em.remove(student);
	}
	
	public void saveStudWithPassport() {
		
		Passport passport =new Passport("D1kjk4j");
		em.persist(passport);
		
		Student stud = new Student ("Raman");
		stud.setPassport(passport);
		em.persist(stud);
	}
	
}


