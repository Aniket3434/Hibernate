package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Student;

public class Student_Id_Card_Dao {

	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	
	public EntityManager getEntityManager() {
		entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		entityManager= entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	public void saveStudent(Student student) {
		EntityManager entityManager=getEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
	
	public void updateStudent(Student student) {
		EntityManager entityManager=getEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
	
	public void findById(int id) {
		EntityManager entityManager=getEntityManager();
		Student student=entityManager.find(Student.class,id);
		if(student!=null) {
			System.out.println(student);
		}else {
			System.out.println("==========Id Not Found============");
		}
	}
}
