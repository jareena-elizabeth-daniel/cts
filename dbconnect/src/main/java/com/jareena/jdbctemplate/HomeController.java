package com.jareena.jdbctemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jareena.jdbctemplate.model.ClassEmployee;
import com.jareena.jdbctemplate.service.EmployeeService;

@Controller
public class HomeController {
	
	@Autowired 
	EmployeeService employeeService;
	
	 @RequestMapping("/home")
	   String home() {
		   return "home";
	   }
	 
	 @RequestMapping("/emp")
	   String getStudents(Model model) {
		   List<ClassEmployee> list = employeeService.getAllStudents();
		   System.out.println(list);
		   model.addAttribute("emplist", list);
		   
		   return "listEmployee";
	   }
	
	
}
