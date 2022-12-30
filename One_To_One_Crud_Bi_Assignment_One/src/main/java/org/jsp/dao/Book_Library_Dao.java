package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Book;
import org.jsp.dto.Library;

public class Book_Library_Dao {

	private EntityManagerFactory entityManagerFactory=null;
	private EntityManager entityManager=null;
	private EntityTransaction entityTransaction=null;
	
	private EntityManager getEntityManager() {
		entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		entityManager =entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	public void saveBook(Book book) {
		EntityManager manager = getEntityManager();
		entityTransaction=manager.getTransaction();
		entityTransaction.begin();
		manager.persist(book);
		entityTransaction.commit();
	}
	
	public void saveLibrary(Library library) {
		EntityManager manager= getEntityManager();
		entityTransaction =manager.getTransaction();
		entityTransaction.begin();
		manager.persist(library);
		entityTransaction.commit();
	}

	public void findById(int id) {
		EntityManager entityManager = getEntityManager();
		Book book = entityManager.find(Book.class,id);
		if(book!=null) {
			System.out.println(book);
		}else {
			System.out.println("Id not found"+id);
		}
	}
	
	public void deleteByid(int id) {
		EntityManager entityManager =getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Library library = entityManager.find(Library.class,id);
		if(library!=null) {
			entityManager.remove(library);
			entityTransaction.commit();
			System.out.println("Data deleted for id"+id);
		}else {
			System.out.println("Id not found"+id);
		}
	}

}
