package org.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Library {
	
	@Id
	private int library_id;
	private String validity;
	private int mobile;
	
	@OneToOne(mappedBy="library",cascade=CascadeType.ALL)
	private Book book;

	public int getLibrary_id() {
		return library_id;
	}

	public void setLibrary_id(int library_id) {
		this.library_id = library_id;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Library [library_id=" + library_id + ", validity=" + validity + ", mobile=" + mobile + ", book=" + book
				+ "]";
	}
	
	
	

}
