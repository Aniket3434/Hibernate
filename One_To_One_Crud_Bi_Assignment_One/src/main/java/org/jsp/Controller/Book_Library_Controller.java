package org.jsp.Controller;

import org.jsp.dao.Book_Library_Dao;
import org.jsp.dto.Book;
import org.jsp.dto.Library;

public class Book_Library_Controller {

	public static void main(String[] args) {
		
		Book book = new Book();
		book.setBookid(10);
		book.setSubject("History");
		book.setBook_author("Vasco-d-gama");
		book.setEntrydate("July 22");
		
		Library library = new Library();
		library.setLibrary_id(100);
		library.setValidity("Jan-23");
		library.setMobile(987654321);
		
		book.setLibrary(library);
		
		Book_Library_Dao dao = new Book_Library_Dao(); 
		dao.saveBook(book);
		dao.saveLibrary(library);
		//dao.findById(100);
		//dao.deleteByid(1000);
		

	}

}
