package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dao.Customer_Product_Dao;
import org.jsp.dto.Customer;
import org.jsp.dto.product;

public class Customer_product_controller {

	public static void main(String[] args) {
		
		product product = new product();
		product.setProductname("T-shirt");
		product.setBrand("Duke");
		product.setPrice(999);
		
		product product1 = new product();
		product.setProductname("shirt");
		product.setBrand("h&m");
		product.setPrice(888);
		
		List<product>list = new ArrayList<product>();
		list.add(product);
		list.add(product1);
		
		Customer customer = new Customer();
		customer.setName("Dimple");
		customer.setAddress("Banglore");
		customer.setPhone(123456789);
		customer.setProduct(list);
		
		Customer customer1 = new Customer();
		customer1.setName("pimple");
		customer1.setAddress("Mumbai");
		customer1.setPhone(987654321);
		customer1.setProduct(list);
		
		Customer_Product_Dao dao = new Customer_Product_Dao();
		dao.saveCustomer(customer);
		dao.saveCustomer(customer1);
	}
}
