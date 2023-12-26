package com.techkonnect.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techkonnect.entity.Student;
import com.techkonnect.java.List;
import com.techkonnect.service.TechKonnectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;






@RestController
public class TechKonnectController {

	@Autowired
	public TechKonnectService techKonnectService;
	Map<Integer, Student> studentMap = new HashMap<>();






	@PostMapping("/post/updateStudents")
	public String updateStudent() {

		return "Updated Student : Test";


	}

	@PutMapping("/put/createStudents")
	public String cStudent(@RequestBody Student student) {

		techKonnectService.createStudent(student);

		return "Created Student : " + student.getFirstName() + " Student Email :" + student.getEmail() + " Student Contact : " + student.getContact();

	}


	@GetMapping("/get/Students/{studentId}")
	public ResponseEntity<String> getStudentDetails(@PathVariable("studentId") String studentId) {
		try {
			Long id = Long.parseLong(studentId);
			Student student = techKonnectService.getStudentById(id);

			if (DuplicateStudentId(id)) {
				return new ResponseEntity<>("Duplicated Student Id: " + studentId, HttpStatus.CONFLICT);
			}

			if (student != null) {
				String response = "Student Details - ID: " + student.getStudentId() +
						", Name: " + student.getFirstName() +
						", Email: " + student.getEmail() +
						", Contact: " + student.getContact();

				return new ResponseEntity<>(response, HttpStatus.OK);
			} else {
				return new ResponseEntity<>("Student not found with ID: " + studentId, HttpStatus.NOT_FOUND);
			}
		} catch (NumberFormatException e) {
			return new ResponseEntity<>("Invalid student ID format: " + studentId, HttpStatus.BAD_REQUEST);
		}
	}

	private boolean DuplicateStudentId(Long id) {
		return false;
	}
}