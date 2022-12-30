package org.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	private int sid;
	private String sname;
	
	@ManyToMany(mappedBy = "student", cascade=CascadeType.ALL)
	List<Courses> Courses;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Courses> getCourses() {
		return Courses;
	}

	public void setCourses(List<Courses> courses) {
		Courses = courses;
	}
	
	

}
