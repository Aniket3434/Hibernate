package org.jsp.Car;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

@Entity
@Table

public class Car {
	@Id
	private int id;
	private String name;
	private String color;
	private double mno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getMno() {
		return mno;
	}
	public void setMno(double mno) {
		this.mno = mno;
	}
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.setId(1);
		c.setName("Aniket");
		c.setColor("Purple");
		c.setMno(123456789);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(c);
		transaction.commit();
		
		
		
	}

}
