package com.cts.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.model.Employee;
@Transactional
@Repository
public class EmployeeDao{ 
@Autowired
SessionFactory sessionFactory;

		/*
		 List<Employee> list = null;
		   public List<Employee> getAllEmployees()
		   {
			   list = new ArrayList<Employee>();
			   list.add(new Employee(1, "name1", 15));
			   list.add(new Employee(2, "name2", 17));
			   list.add(new Employee(3, "name3", 18));
			   
			   return list;
		   }
*/

    public List<Employee> getAllEmployees() {
   	
   	 Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Employee.class);
   	 return criteria.list();
    } 

    
    public void saveOrUpdate(Employee employee) {
 		System.out.println("DATA::: "+employee);
 		sessionFactory.getCurrentSession().saveOrUpdate(employee);
 		System.out.println("Employee saved !!!");
 	}

}
