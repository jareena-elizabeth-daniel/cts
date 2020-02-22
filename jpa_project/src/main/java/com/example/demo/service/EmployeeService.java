package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Transactional
	public List<Employee> getAllEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}
	
	@Transactional
	public List<Employee> findByFirstname(String name) {
		return employeeRepository.findByFirstname(name);
	}

	@Transactional
	public Optional<Employee> getById(Long id) {
		return employeeRepository.findById(id);
	}

	@Transactional
	public void deleteEmployee(Long personId) {
		employeeRepository.deleteById(personId);
	}

	@Transactional
	public boolean addEmployee(Employee person) {
		return employeeRepository.save(person) != null;
	}

	@Transactional
	public boolean updateEmployee(Employee person) {
		return employeeRepository.save(person) != null;
	}
}