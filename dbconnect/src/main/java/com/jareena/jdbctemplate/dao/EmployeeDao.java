package com.jareena.jdbctemplate.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jareena.jdbctemplate.model.ClassEmployee;

@Repository("EmployeeDao")
public class EmployeeDao {
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public List<ClassEmployee>  getAllStudents() {   	
	   	
    	List<ClassEmployee> emplist = template.query(
			    "select * from employee",
			    new RowMapper() {
			        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			        	ClassEmployee emp= new ClassEmployee();
			        	emp.setEid((rs.getInt("eid")));
			        	emp.setEname(rs.getString("ename"));
			        	emp.setAge(((rs.getInt("age"))));
			            return emp;
			        }
			    });
         return emplist;
	
	}

}
