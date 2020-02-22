package hb.hibernateInherit;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEES")

public class Employee extends Person {
	
	private Date joiningDate;
	
	private String departmentName;

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Employee(Long personId, String firstname, String lastname) {
		super(firstname, lastname);
		
	}

	public Employee(String firstname, String lastname, Date joiningDate, String departmentName) {
		super(firstname, lastname);
		this.joiningDate = joiningDate;
		this.departmentName = departmentName;
	}
	
	
		
	}
	
	
	
	
	


