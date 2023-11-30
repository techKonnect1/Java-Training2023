package com.techkonnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techkonnect.java.List;
import com.techkonnect.service.TechKonnectService;



@RestController
public class TechKonnectController {
	
	@Autowired
	public TechKonnectService techKonnectService;
	
	@GetMapping("/get/getStudents")
	public String getTestMessage(String firstname) {
		
		/*
		 * if(validateIfFirstNameIsNull(firstname)) {
		 * 
		 * return "Not a valid first name"; }
		 */
		
		
		return techKonnectService.getTestMessageService();
	
		
	}

	
	private boolean validateIfFirstNameIsNull(String firstname) {
		
		if(firstname == null )
			return true;
		return false;
		
		
	}


	@GetMapping("/getTestMessage1")
	public String getTestMessage1() {
		
		return "Hello Word1";
		
	}

	
	
	
}
