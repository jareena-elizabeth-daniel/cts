package com.cts.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.StudentDao;
import com.cts.model.Student;
import com.cts.service.StudentService;

@RestController
public class HomeController {

		//@Autowired
		//StudentDao dao;
	@Autowired
	StudentService studentService;
   
	@RequestMapping("/homedata")
	public ResponseEntity<Student> getHomeData() {
		
		return new ResponseEntity<Student>(new Student(11,"Name11", "Add1111"), HttpStatus.OK);
			
	}
	
	@GetMapping("/getAllUsers")
	public List<Student> getUsers(){
				
		return studentService.getAllStudents();
	}
	
	//@GetMapping("/user/{id}")
	//public ResponseEntity<Student> getUser(@PathVariable("id") int id) {
	//	return studentService.getAllStudents(id);
	//}
	
	@PostMapping("/user")
	public ResponseEntity<Student> saveUser(@RequestBody Student user) {
		return studentService.saveStudent(user);
	}
	
	@DeleteMapping("user/{id}")
	public int deleteUser(@PathVariable("id") int id) {
		return studentService.deleteStudent(id);
	}
	
	@PutMapping("/user")
	public Student updateUser(@RequestBody Student user) {
		return studentService.editStudent(user);
	}
	
}
