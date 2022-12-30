package org.jsp.controller;

import org.jsp.dao.One_To_One_Dao_Mobile;
import org.jsp.dto.Mobile;
import org.jsp.dto.Os;

public class Controller {

	public static void main(String[] args) {

		Mobile mobile = new Mobile();
		mobile.setId(100);
		mobile.setName("Samsung");
		mobile.setCost(20000);

		Os os = new Os();
		os.setId(10);
		os.setBit(64);
		os.setName("Android");

		mobile.setOs(os);

		One_To_One_Dao_Mobile dao = new One_To_One_Dao_Mobile();
		dao.saveMobile(mobile);
	}
}
