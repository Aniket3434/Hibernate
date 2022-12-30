package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Flipkart;

public class Flipkart_Items_Dao 
{
	private EntityManagerFactory entityManagerFactory=null;
	private EntityManager entityManager=null;
	private EntityTransaction entityTransaction=null;
	
	
	
	public EntityManager getEntityManager()
	{
		entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
		
		
	}
	
	public void saveUser(Flipkart flipkart) {
		
		entityManager=getEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
		
		entityManager.persist(flipkart);
		entityTransaction.commit();
		
	}
	
	
}