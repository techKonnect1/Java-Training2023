package com.techkonnect.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techkonnect.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {
	
	
	//List<Student> findByFirstNameAndLastName(Student student);
    // Additional custom queries can be defined here if needed
}
