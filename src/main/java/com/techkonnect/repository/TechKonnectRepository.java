package com.techkonnect.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techkonnect.java.List;

@Repository
public class TechKonnectRepository {
	
	
	public String getTestMessageRepository() {
		
		return "The call came to repository class";
		
	}

	
	
}
