package hb.hibernateop;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person {
	@Id
	@GeneratedValue
	@Column(name="PID")	
    int pid;
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pnane=" + pnane + ", age=" + age + "]";
	}
	@Column(name="pname")
    String pnane;
    
	@Column(name="age")
    int age;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPnane() {
	return pnane;
}
public void setPnane(String pnane) {
	this.pnane = pnane;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
   
}