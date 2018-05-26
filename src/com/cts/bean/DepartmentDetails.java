package com.cts.bean;

public class DepartmentDetails {
private int id;
private String name;
private EmployeeDetails employeedetails;
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
public EmployeeDetails getEmployeedetails() {
	return employeedetails;
}


}
