package com.cts.bean;

import java.util.List;

public class DepartmentDetails {
private int id;
private String name;
private List<EmployeeDetails> employeedetails;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}
public DepartmentDetails(int id, String name) {
	super();
	this.id = id;
	this.name = name;
	
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "DepartmentDetails [id=" + id + ", name=" + name + ", employeedetails=" + employeedetails + "]";
}
public List<EmployeeDetails> getEmployeedetails() {
	return employeedetails;
}
public void setEmployeedetails(List<EmployeeDetails> employeedetails) {
	this.employeedetails = employeedetails;
}



}
