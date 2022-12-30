package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Mobile;

public class One_To_One_Dao_Mobile {

	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	
	public EntityManager getEntityManager() {
		entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	public void saveMobile(Mobile mobile) {
		EntityManager entityManager=getEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityTransaction.commit();
	}
}