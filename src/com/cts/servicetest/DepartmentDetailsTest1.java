package com.cts.servicetest;

import com.cts.bean.DepartmentDetails;
import com.cts.bean.EmployeeDetails;
import com.cts.service.DepartmentService;
import com.cts.service.EmployeeService;
import com.cts.serviceimpl.DepartmentServiceImpl;
import com.cts.serviceimpl.EmployeeServiceImpl;

public class DepartmentDetailsTest1 {
	static EmployeeService employeedetails;
	static  DepartmentService departmentdetails;
	static DepartmentDetails dep;
	static EmployeeDetails emp;
	public static void init()
	
	{
		employeedetails=new EmployeeServiceImpl();
		      
	
	
	emp=new EmployeeDetails(101,"Goldengod",40987);
	employeedetails.add(emp);
	emp=new EmployeeDetails(102,"revathi",79766);
	employeedetails.add(emp);//poly
	emp=new EmployeeDetails(103,"dinesh",9849);
	employeedetails.add(emp);
	
	departmentdetails=new DepartmentServiceImpl(employeedetails);
	dep=new DepartmentDetails(1,"Production");
	departmentdetails.add(dep);
	dep=new DepartmentDetails(2,"management");
	departmentdetails.add(dep);
	dep=new DepartmentDetails(3,"support");
	departmentdetails.add(dep);                                         //dep added
	

	
	}
	
	
public static void main(String[]args)
{
	
	init();
	departmentdetails.addEmployeeDetailsToDepartment(101,1);
	
	System.out.println(departmentdetails.getdepartment());
departmentdetails.addEmployeeDetailsToDepartment(102,2);
	
	System.out.println(departmentdetails.getdepartment());
departmentdetails.addEmployeeDetailsToDepartment(103,3);
	
	System.out.println(departmentdetails.getdepartment());
	
	emp=new EmployeeDetails(102,"revathi",79766);
	employeedetails.add(emp);
	//departmentdetails.display();
	//departmentdetails.addEmployeeDetailsToDepartment(101, 1);
	//System.out.println(departmentdetails.getdepartment());
	//employeedetails.display();
	
	
	//dep=new DepartmentDetails(1,"supplier");
	//departmentdetails.update(dep);
	//departmentdetails.display();
	//departmentdetails.delete(2);
	departmentdetails.display();
	
	
}
}
