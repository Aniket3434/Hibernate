package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Student;
import org.jsp.dto.University;

public class Student_University_Dao {
	
	private EntityManagerFactory entityManagerFactory=null;
	private EntityManager entityManager=null;
	private EntityTransaction entityTransaction=null;
	
	private EntityManager getEntityManager() {
		entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		entityManager =entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	public void saveStudent(Student student) {
		EntityManager manager = getEntityManager();
		entityTransaction=manager.getTransaction();
		entityTransaction.begin();
		manager.persist(student);
		entityTransaction.commit();
	}
	
	public void saveUniversity(University university) {
		EntityManager manager= getEntityManager();
		entityTransaction =manager.getTransaction();
		entityTransaction.begin();
		manager.persist(university);
		entityTransaction.commit();
	}

	public void findById(int id) {
		EntityManager entityManager = getEntityManager();
		Student items = entityManager.find(Student.class,id);
		if(items!=null) {
			System.out.println(items);
		}else {
			System.out.println("Id not found"+id);
		}
	}
	
	public void deleteByid(int id) {
		EntityManager entityManager =getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		University university = entityManager.find(University.class,id);
		if(university!=null) {
			entityManager.remove(university);
			entityTransaction.commit();
			System.out.println("Data deleted for id"+id);
		}else {
			System.out.println("Id not found"+id);
		}
	}
}
