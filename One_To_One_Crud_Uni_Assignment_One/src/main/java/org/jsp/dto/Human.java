package org.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Human {
	
	@Id
	private int adharid;
	private String name;
	private String email;
	private int mobile;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Adharcard adharcard;

	public int getAdharid() {
		return adharid;
	}

	public void setAdharid(int adharid) {
		this.adharid = adharid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public Adharcard getAdharcard() {
		return adharcard;
	}

	public void setAdharcard(Adharcard adharcard) {
		this.adharcard = adharcard;
	}

	@Override
	public String toString() {
		return "Human [adharid=" + adharid + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", adharcard=" + adharcard + "]";
	}
	
	

}
