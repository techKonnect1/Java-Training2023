package com.techkonnect.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techkonnect.entity.Student;

@Repository
public class TechKonnectRepository {
	
	@Autowired
	public StudentRepository studentRepository;
	
	
	public String getTestMessageRepository() {
		
		return "The call came to repository class";
		
	}

	
	public void saveStudent(Student student) {
		studentRepository.save(student);
		
	}
	
	
}
