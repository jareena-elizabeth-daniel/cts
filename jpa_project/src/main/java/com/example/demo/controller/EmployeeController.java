package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employee")
    public List<Employee> listAllEmployees(){ 
		 
   	 return (List<Employee>) employeeService.getAllEmployees(); 
    }
	 
	@RequestMapping(value = "/employeeByName/{name}", method = RequestMethod.GET)
	public List<Employee> getEmployeeByFirstname(@PathVariable String name) {
		return employeeService.findByFirstname(name);
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public HttpStatus insertPersone(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return HttpStatus.NO_CONTENT;
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.PUT)
	public HttpStatus updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee)  ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public Optional<Employee> getemployee(@PathVariable Long id) {
		return employeeService.getById(id);
	}
}
	

