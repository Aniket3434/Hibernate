package org.jsp.controller;

import org.jsp.dao.Department_Worker_Dao;
import org.jsp.dto.Department;
import org.jsp.dto.Worker;

public class Department_Worker_Controller {

	public static void main(String[] args) {

		Department department = new Department();
		department.setId(2);
		department.setAddress("Thane");
		department.setName("Aniket");
		department.setPh_no(987654321);

		Worker worker = new Worker();
		worker.setW_address("Mumbai");
		worker.setW_id(100);
		worker.setW_name("Magne");
		worker.setW_sal(2500);
		department.setWorker(worker);
		
		Department_Worker_Dao dao = new Department_Worker_Dao();
		dao.saveDepartment(department);
	}

}
