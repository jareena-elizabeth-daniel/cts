package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class StudentController {

	 @Autowired
	 StudentService studentService;
	
	 @GetMapping("/student")
     public List<Student> listAllSrudents(){ 
		 
    	 return (List<Student>) studentService.getAllStudents();
     }
	 
	// @PostMapping("/student")
	 @RequestMapping(value = "/student", method = RequestMethod.POST)
	 public Student saveStudent(@RequestBody Student student) {
		 return studentService.addStudent(student);
	 }
}

