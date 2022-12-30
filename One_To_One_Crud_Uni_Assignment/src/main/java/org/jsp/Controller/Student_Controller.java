package org.jsp.Controller;

import org.jsp.dao.Student_Id_Card_Dao;
import org.jsp.dto.Id_Card;
import org.jsp.dto.Student;

public class Student_Controller {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(100);
		student.setName("Magne");
		student.setEmail("Magne69@gmail.com");
		student.setBranch("Civil");
		student.setBatch("A345E67");
		student.setMobile(987654321);
		
		Id_Card id_card = new Id_Card();
		id_card.setId(200);
		id_card.setAddress("Thane");
		id_card.setLevel("Fresher");
		id_card.setValidity("02-Jan-2021 to 05-Jan-2022");
		
		student.setId_Card(id_card);
		Student_Id_Card_Dao dao = new Student_Id_Card_Dao();
		dao.saveStudent(student);
		
		//dao.updateStudent(student);
		//dao.findById(100);
		

	}

}
