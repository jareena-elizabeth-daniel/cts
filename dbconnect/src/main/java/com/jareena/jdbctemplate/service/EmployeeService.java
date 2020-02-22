package com.jareena.jdbctemplate.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jareena.jdbctemplate.dao.EmployeeDao;
import com.jareena.jdbctemplate.model.ClassEmployee;


	@Service
	public class EmployeeService {
		
		@Autowired
		EmployeeDao e;
		
	    public List<ClassEmployee> getAllStudents(){
	    	return e.getAllStudents();
	    }
	}

