package com.techkonnect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techkonnect.entity.Student;
import com.techkonnect.repository.StudentRepository;

@Service
public class TechKonnectService {
	
	@Autowired
	public StudentRepository studentRepository;

	
	
	public void createStudent(Student student) {
		
		if(checkIfStudentExists(student)) {
		
			studentRepository.save(student);
		}
		
	}


	private boolean checkIfStudentExists(Student student) {

		/*
		 * List<Student> findByFirstNameAndLastName =
		 * studentRepository.findByFirstNameAndLastName(student);
		 * 
		 * return findByFirstNameAndLastName.size()>0;
		 */
		return false;
	}

	

	
	
	
}
