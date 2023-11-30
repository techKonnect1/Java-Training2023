package com.techkonnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techkonnect.java.List;
import com.techkonnect.repository.TechKonnectRepository;

@Service
public class TechKonnectService {
	
	@Autowired
	public TechKonnectRepository techKonnectRepository;
	
	public String getTestMessageService() {
		
		
		return techKonnectRepository.getTestMessageRepository();
		
	}

	

	
	
	
}
