package org.jsp.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Bike;

public class Bike_Controller {

	public static void main(String[] args) {
		

		Bike bike = new Bike();
		bike.setColor("Black");
		bike.setId(101);
		bike.setName("Splender");
		bike.setPrice(85000);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entitytransaction = entityManager.getTransaction();
		
		Bike b =entityManager.find(Bike.class,200);
		Bike b1=entityManager.find(Bike.class,201);
		System.out.println(b);
		System.out.println(b1);
		
		Bike b2 = entityManager.find(Bike.class,200);
		Bike b3 = entityManager.find(Bike.class,201);
		System.out.println(b2);
		System.out.println(b3);
	}

}
