package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Amazon;

public class Dao {

	private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	private EntityManager entityManager=entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction(); 
	
	public void saveUser(Amazon amazon) {
		entityTransaction.begin();
		entityManager.persist(amazon);
		entityTransaction.commit();
	}
}
