package org.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class University {
	
	@Id
	private int University_id;
	private String name;
	private String country;
	
	@OneToOne(mappedBy="university",cascade=CascadeType.ALL)
	private Student student;

	public int getUniversity_id() {
		return University_id;
	}

	public void setUniversity_id(int university_id) {
		University_id = university_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "University [University_id=" + University_id + ", name=" + name + ", country=" + country + ", student="
				+ student + "]";
	}
	
	

}
