package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.StudentModel;
import com.app.repository.StudentRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class StudentController {

	
	@Autowired
	private StudentRepository studentRepo;
	
	
	@GetMapping("/studentss")
	public List<StudentModel>getAllStudentss(){
		return studentRepo.findAll();
	}
	
	@PostMapping("/add-student")
	public StudentModel createStudemnt(@RequestBody StudentModel student) {
		return studentRepo.save(student);
	}
	
	
}
