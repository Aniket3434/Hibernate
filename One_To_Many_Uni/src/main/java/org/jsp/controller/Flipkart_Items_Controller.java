package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dao.Flipkart_Items_Dao;
import org.jsp.dto.Flipkart;
import org.jsp.dto.items;


public class Flipkart_Items_Controller {
	public static void main(String[] args) {
		
		Flipkart kart = new Flipkart();
		kart.setEmailid("aniket1@gmail.com");
		kart.setAddress("thane");
		kart.setMno(123456789);
		kart.setName("Aniket");
		
		items items = new items();
		items.setId(1);
		items.setName("Bat");
		items.setBrand("Rebook");
		items.setPrice(5000);
		
		items items2 = new items();
		items2.setId(2);
		items2.setName("chocolate");
		items2.setBrand("parle");
		items2.setPrice(5);
		
		items items3 = new items();
		items3.setId(3);
		items3.setName("Biscuit");
		items.setBrand("parle");
		items.setPrice(55);
		
		
		List<items> list = new ArrayList<items>();
		list.add(items);
		list.add(items2);
		list.add(items3);
		
		kart.setItems(list);
		
		Flipkart_Items_Dao items_Dao = new Flipkart_Items_Dao();
		items_Dao.saveUser(kart);
	}

}
