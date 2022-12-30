package org.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Worker {

	@Id
	private int w_id;
	private String w_name;
	private double w_sal;
	private String w_address;
	public int getW_id() {
		return w_id;
	}
	public void setW_id(int w_id) {
		this.w_id = w_id;
	}
	public String getW_name() {
		return w_name;
	}
	public void setW_name(String w_name) {
		this.w_name = w_name;
	}
	public double getW_sal() {
		return w_sal;
	}
	public void setW_sal(double w_sal) {
		this.w_sal = w_sal;
	}
	public String getW_address() {
		return w_address;
	}
	public void setW_address(String w_address) {
		this.w_address = w_address;
	}
	
	
	
}
