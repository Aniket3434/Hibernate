package org.jsp.Controller;

import org.jsp.dao.Items_Invoice_Dao;
import org.jsp.dto.Invoice;
import org.jsp.dto.Items;

public class Items_Invoice_Controller {

	public static void main(String[] args) {
		
		Items items = new Items();
		items.setId(100);
		items.setName("Book");
		items.setPrice(350);
		
		Invoice invoice= new Invoice();
		invoice.setId(10);
		invoice.setCname("Dimple");
		invoice.setAddress("Thane");
		invoice.setQunty(5);
		invoice.setItems(items);
		items.setInvoice(invoice);
		
		Items_Invoice_Dao dao = new Items_Invoice_Dao();
		dao.saveitems(items);

	}

}
