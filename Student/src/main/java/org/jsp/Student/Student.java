package org.jsp.Student;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	private int id;
	private String fame;
	private String lname;
	private int Rollno;
	private String address;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFame() {
		return fame;
	}

	public void setFame(String fame) {
		this.fame = fame;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(1);
		s.setFame("Adarsh");
		s.setLname("Gupta");
		s.setRollno(10);
		s.setAddress("Mumbai");
		
		Student s1 = new Student();
		s1.setId(2);
		s1.setFame("Pooonam");
		s1.setLname("Pandey");
		s1.setRollno(11);
		s1.setAddress("Andheri");
		
		Student s2 = new Student();
		s2.setId(3);
		s2.setFame("Venkatesh");
		s2.setLname("Swami");
		s2.setRollno(12);
		s2.setAddress("Dadar");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction =  manager.getTransaction();
		
		transaction.begin();
		manager.persist(s);
		manager.persist(s1);
		manager.persist(s2);
		transaction.commit();
		
		
		
	}
	
	
	

}
