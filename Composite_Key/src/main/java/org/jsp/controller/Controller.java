package org.jsp.controller;

import org.jsp.dao.Dao;
import org.jsp.dto.Amazon;
import org.jsp.dto.Amazon_Id;

public class Controller {

	public static void main(String[] args) {
		
		Amazon_Id id = new Amazon_Id();
		id.setEmail("dimple@gmail.com");
		id.setMno(1234567891);
		
		Amazon amazon = new Amazon();
		amazon.setPwd("sheela@123gmail.com");
		amazon.setAmazon_id(id);
		
		Dao dao = new Dao();
		dao.saveUser(amazon);
		

	}

}
