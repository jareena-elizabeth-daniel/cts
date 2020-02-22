package com.jareena.jdbctemplate.model;

public class ClassEmployee {
	
	int eid;
	String ename;
	int age;
	
	
	
	public ClassEmployee() {
		super();
		
	}
	public ClassEmployee(int eid, String ename, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.age = age;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "ClassEmployee [eid=" + eid + ", ename=" + ename + ", age=" + age + "]";
	}

}
