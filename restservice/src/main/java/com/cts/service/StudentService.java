package com.cts.service;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cts.dao.StudentDao;
import com.cts.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
    public List<Student> getAllStudents(){
    	return studentDao.getUsers();
    }
    
    public ResponseEntity<Student> saveStudent(Student student) {
    	return studentDao.insertUser(student);
    }
    
    public int deleteStudent(int id) {
    	return studentDao.deleteUser(id);
    }
    
    public Student editStudent(Student user) {
    	return studentDao.updateUser(user);
    }
    
    }
    