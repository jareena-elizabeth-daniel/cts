package hb.one_to_many;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENT")
public class Department {
   @Id
   @GeneratedValue
   @Column(name="department_id")
   private Long departmentId;
   
   @Column(name="DEP_NAME")
   private String departmentName;
   
   @OneToMany(mappedBy="department")// this is the field in WorkEmployee //class(table)
   private Set<WorkEmployee> employees;
   
public Long getDepartmentId() {
	return departmentId;
}

public void setDepartmentId(Long departmentId) {
	this.departmentId = departmentId;
}

public String getDepartmentName() {
	return departmentName;
}

public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

public Set<WorkEmployee> getEmployees() {
	return employees;
}

public void setEmployees(Set<WorkEmployee> employees) {
	this.employees = employees;
}
  
}