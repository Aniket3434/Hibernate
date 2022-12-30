package org.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	private int id;
	private String name;
	private String email;
	private String branch;
	private String batch;
	private int mobile;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Id_Card id_card;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public Id_Card getId_card() {
		return id_card;
	}

	public void setId_card(Id_Card id_card) {
		this.id_card = id_card;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", branch=" + branch + ", batch=" + batch
				+ ", mobile=" + mobile + ", id_card=" + id_card + "]";
	}

	public void setId_Card(Id_Card id_card2) {
		
	}

	
	
}
