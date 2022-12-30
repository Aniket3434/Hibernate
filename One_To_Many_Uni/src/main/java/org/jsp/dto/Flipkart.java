package org.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Flipkart {
	@Id
	private String emailid;
	private String name;
	private long mno;
	private String address;
	
	@OneToMany(cascade= CascadeType.ALL)
	private List<items> items;

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMno() {
		return mno;
	}

	public void setMno(long mno) {
		this.mno = mno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<items> getItems() {
		return items;
	}

	public void setItems(List<items> items) {
		this.items = items;
	}
	
	
	

}
