package com.techkonnect.controller;

import java.util.HashMap;
import java.util.Map;
import com.techkonnect.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techkonnect.entity.Student;
//import com.techkonnect.java.List;
import java.util.List;
import com.techkonnect.service.TechKonnectService;
import java.util.Optional;

@RestController
public class TechKonnectController {

	@Autowired
	private final TechKonnectService techKonnectService;
	Map<Integer, Student> studentMap = new HashMap<>();

	
	@GetMapping("/get/getStudents")
	public String getTestMessage(
								@RequestParam("studentId") Integer studentId) {
		
		Student  student = studentMap.get(studentId);
		return 	"Created Student : "+ student.getFirstName() + " Student Email :"+student.getEmail() +" Student Contact : "+ student.getContact();
	}

	@GetMapping("/get/api/students")
	public List<Student> getAllStudents()
	{
		return techKonnectService.getAllStudents();
	}
	@GetMapping("/get/V2/getStudents")
	public String getV2Student(
								@RequestParam("name") String studentName,
								@RequestParam("studentId") Integer studentId) {

		return "Student Name : " + studentName + " Student Id : " + studentId;
	}
	@PostMapping("/post/updateStudents")
	public String updateStudent()
	{
		return "Updated Student : Test";
	}
	@Autowired
	public TechKonnectController(TechKonnectService techKonnectService) {

		this.techKonnectService = techKonnectService;
	}
	@PutMapping("/put/createStudents")
	public ResponseEntity<String> cStudent(@RequestBody Student student) {

		try {
			
			if (student.getFirstName().equals("")) {
				return new ResponseEntity<>("First Name cannot be empty", HttpStatus.BAD_REQUEST);
			}
			
			techKonnectService.createStudent(student);
		
		} catch (Exception e) {

			return new ResponseEntity<>("First Name cannot be empty", HttpStatus.INTERNAL_SERVER_ERROR);

		}

		return new ResponseEntity<>("This is valid Request", HttpStatus.OK);


	}


}





	

