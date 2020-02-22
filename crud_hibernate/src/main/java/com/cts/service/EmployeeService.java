package com.cts.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.EmployeeDao;
import com.cts.model.Employee;

	@Service
	public class EmployeeService {
	   
		@Autowired
		EmployeeDao employeeDao;
		
		public List<Employee> getAllEmployees(){
			return employeeDao.getAllEmployees();
		}
		
		public void saveOrUpdate(Employee employee) {
			employeeDao.saveOrUpdate(employee);
		}
	}

