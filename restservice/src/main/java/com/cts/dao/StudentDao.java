package com.cts.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.cts.model.Student;
@Component
public class StudentDao {
	static List<Student> list = null;
	
	static {
		list = new ArrayList<Student>();
		
		list = new ArrayList<Student>(); 
		list.add(new Student(1, "Name1", "add1"));
		list.add(new Student(2, "Name2", "add2"));
		list.add(new Student(3, "Name3", "add3"));
		list.add(new Student(4, "Name4", "add4"));
	}
	
public List<Student> getUsers(){		
		
		return StudentDao.list;
	}	
	public ResponseEntity<Student> insertUser(Student user){
		list.add(user);		
		return new ResponseEntity<Student>(user, HttpStatus.OK);
	}
	public ResponseEntity<Student> getUser(int id){
		for (Student user : list) {
			if(user.getUid() == id) {
				return new ResponseEntity<Student>(user, HttpStatus.OK);
			}
		}
		return null;
	}
	public int deleteUser(int id){
		for (Student user : list) {
			if(user.getUid() == id) {
				list.remove(user);
				return id;
			}
		}
		return 0;
	}
	
	
	public Student updateUser(Student user){
		for (Student user1 : list) {
			if(user1.getUid() == user.getUid()) {
				list.remove(user1);
				list.add(user);
				return user;
			}
		}
		return null;
	}
}
