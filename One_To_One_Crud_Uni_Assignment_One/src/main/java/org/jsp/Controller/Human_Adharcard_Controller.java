package org.jsp.Controller;

import org.jsp.dao.Human_Adharcard_Dao;
import org.jsp.dto.Adharcard;
import org.jsp.dto.Human;

public class Human_Adharcard_Controller {

	public static void main(String[] args) {
		
		Human human = new Human();
		human.setAdharid(234567896);
		human.setName("Om");
		human.setEmail("om420@gmail.com");
		human.setMobile(987654321);
		
		Adharcard adharcard  =new Adharcard();
		adharcard.setRegister_id(98764534);
		adharcard.setAddress("Thane");
		adharcard.setBirthdate("01-01-2022");
		
		human.setAdharcard(adharcard);
		Human_Adharcard_Dao dao = new Human_Adharcard_Dao();
		dao.saveHuman(human);
		dao.updateHuman(human);
		//dao.findById(234567896);
		//dao.deleteById(98764534);
	}

}
