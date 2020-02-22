package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	public int sid;
	public String name;
	public int age;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int sid, String name, int age) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [sid=" + sid + ", name=" + name + ", age=" + age + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
