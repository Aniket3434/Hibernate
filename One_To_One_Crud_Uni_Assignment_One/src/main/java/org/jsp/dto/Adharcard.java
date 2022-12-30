package org.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adharcard {

	@Id
	private int register_id;
	private String address;
	private String Birthdate;
	
	public int getRegister_id() {
		return register_id;
	}
	public void setRegister_id(int register_id) {
		this.register_id = register_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(String birthdate) {
		Birthdate = birthdate;
	}
	
	@Override
	public String toString() {
		return "Adharcard [register_id=" + register_id + ", address=" + address + ", Birthdate=" + Birthdate + "]";
	}
}
