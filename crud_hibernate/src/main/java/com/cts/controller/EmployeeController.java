package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.model.Employee;
import com.cts.service.EmployeeService;

@Controller
public class EmployeeController 
	{
	@Autowired
	EmployeeService employeeservice;
		
		@RequestMapping("/home")
		public String home()
			{
				return "home";
			}			
		@RequestMapping("/listEmployees")
		String getEmployee(Model model) {
			List<Employee> list = employeeservice.getAllEmployees();
			model.addAttribute("list", list);
			
			return "listEmployees";
		}
		
		@RequestMapping("/empForm")
		 public String saveEmployee(Model model) {
			 
			 model.addAttribute("employee", new Employee());
			 return "empForm";
		 }
		
		@PostMapping("/saveEmployee")
		 public String saveEmployee(@ModelAttribute("employee") Employee employee) {
			 employeeservice.saveOrUpdate(employee);
			 return "redirect:/listEmployees";
		 }
	}
