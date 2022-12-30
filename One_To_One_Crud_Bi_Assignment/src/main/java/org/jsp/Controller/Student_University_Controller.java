package org.jsp.Controller;

import org.jsp.dao.Student_University_Dao;
import org.jsp.dto.Student;
import org.jsp.dto.University;

public class Student_University_Controller {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setStudent_id(100);
		student.setFirst_name("Om");
		student.setLast_name("Salunkhe");
		student.setBranch("Civil");
		
		University university = new University();
		university.setUniversity_id(1000);
		university.setName("Mumbai");
		university.setCountry("India");
		
		student.setUniversity(university);
		
		Student_University_Dao dao = new Student_University_Dao();
		dao.saveStudent(student);
		dao.saveUniversity(university);
		//.findById(100);
		//dao.deleteByid(1000);
		

	}

}
