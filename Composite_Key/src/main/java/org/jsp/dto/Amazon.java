package org.jsp.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Login")
public class Amazon {
	
	private String pwd;

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@EmbeddedId
	private Amazon_Id amazon_id;

	public Amazon_Id getAmazon_id() {
		return amazon_id;
	}

	public void setAmazon_id(Amazon_Id amazon_id) {
		this.amazon_id = amazon_id;
	}
}
