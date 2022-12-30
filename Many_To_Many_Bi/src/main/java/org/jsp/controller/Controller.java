package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dao.Course_Student_Dao;
import org.jsp.dto.Courses;
import org.jsp.dto.Student;

public class Controller {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setSid(3);
		student.setSname("sagar");
		
		Student student2 = new Student();
		student2.setSid(4);
		student2.setSname("Dimple");
		
		List<Student> list = new ArrayList<Student>();
		list.add(student);
		list.add(student2);
		
		Courses courses = new Courses();
		courses.setCid(200);
		courses.setCname("Java");
		courses.setStudent(list);
		
		Courses courses2 = new Courses();
		courses2.setCid(201);
		courses2.setCname("J2EE");
		courses2.setStudent(list);
		
		List<Courses> list2 = new ArrayList<Courses>();
		list2.add(courses);
		list2.add(courses2);
		
		//student.setCourses(list2);
		//student.setCourses(list2);
		
		Course_Student_Dao dao = new Course_Student_Dao();
		dao.saveCourses(courses2);
		dao.saveCourses(courses2);
		dao.saveStudent(student2);
		dao.saveStudent(student2);
	}

}
