package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Items;

public class Items_Invoice_Dao {

	private EntityManagerFactory entityManagerFactory=null;
	private EntityManager entityManager=null;
	private EntityTransaction entityTransaction=null;
	
	public EntityManager getEntityManager() {
		entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		entityManager=entityManagerFactory.createEntityManager();
		return getEntityManager();
	}
	
	
	public void saveitems(Items items) {
		EntityManager manager = getEntityManager();
		entityTransaction=manager.getTransaction();
		entityTransaction.begin();
		manager.persist(items);
		entityTransaction.commit();
		}
}
