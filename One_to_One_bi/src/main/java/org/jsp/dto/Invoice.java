package org.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Invoice {
	
	@Id
	private int id ;
	private String cname;
	private String address;
	private int qunty;
	
	@OneToOne(mappedBy="invoice",cascade = CascadeType.ALL)
	Invoice invoice;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getQunty() {
		return qunty;
	}

	public void setQunty(int qunty) {
		this.qunty = qunty;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public void setItems(Items items) {
		
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", cname=" + cname + ", address=" + address + ", qunty=" + qunty + ", invoice="
				+ invoice + "]";
	}
	
	
}
