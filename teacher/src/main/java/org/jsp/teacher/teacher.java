package org.jsp.teacher;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

@Entity
@Table
public class teacher {
	
	@Id
	private int id;
	private String tname;
	private int Deptno;
	private String emailid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getDeptno() {
		return Deptno;
	}
	public void setDeptno(int deptno) {
		Deptno = deptno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	
	public static void main(String[] args) {
		
		teacher t = new teacher();
		t.setId(1);
		t.setTname("Sheela");
		t.setDeptno(100);
		t.setEmailid("sheela@gmail.com");
		
		teacher t1 = new teacher();
		t1.setId(2);
		t1.setTname("Leela");
		t1.setDeptno(101);
		t1.setEmailid("leela@gmail.com");
		
		teacher t2 = new teacher();
		t2.setId(3);
		t2.setTname("Peela");
		t2.setDeptno(102);
		t2.setEmailid("peela@gmail.com");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(t);
		manager.persist(t1);
		manager.persist(t2);
		transaction.commit();
	}
	
	
	
	
	
	
	
	

}
