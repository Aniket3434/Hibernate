package org.jsp.dao;

import javax.persistence.EmbeddedId;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Human;

public class Human_Adharcard_Dao {
 
	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	
	public EntityManager getEntityManager() {
		entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	public void saveHuman(Human human) {
		EntityManager entityManager=getEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(human);
		entityTransaction.commit();
	}
	
	public void updateHuman(Human human) {
		EntityManager entityManager=getEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(human);
		entityTransaction.commit();
	}
	
	public void findById(int id) {
		EntityManager entityManager = getEntityManager();
		Human human=entityManager.find(Human.class,id);
		if(human!=null) {
			System.out.println(human);
		}else {
			System.out.println("============Id not found============");
		}
	}
	
	public void deleteById(int id) {
		EntityManager entityManager = getEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		Human human = entityManager.find(Human.class, id);
		if(human!=null) {
			entityManager.remove(human);
			entityTransaction.commit();
			System.out.println("Data deleted for id"+id);
		}else {
			System.out.println("==========Id not found=========="+id);
		}
	}
}

