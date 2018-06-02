package com.cts.servicetest;

import com.cts.bean.DepartmentDetails;
import com.cts.bean.EmployeeDetails;
import com.cts.service.DepartmentService;
import com.cts.service.EmployeeService;
import com.cts.serviceimpl.DepartmentServiceImpl;
import com.cts.serviceimpl.EmployeeServiceImpl;

public class DepartmentDetailsTest {
	private  static EmployeeService employeeservice;	
	private static DepartmentService departmentdetails;

	public static void init() {
		employeeservice=new EmployeeServiceImpl();
		departmentdetails=new DepartmentServiceImpl(employeeservice);
		
		employeeservice=new EmployeeServiceImpl();
		EmployeeDetails emp=new 	EmployeeDetails(1,"sara",50000);
		employeeservice.add(emp);
		emp=new EmployeeDetails(2,"dinesh",6000);
		employeeservice.add(emp);
		
		departmentdetails=new DepartmentServiceImpl();
		DepartmentDetails dep=new DepartmentDetails(1,"production");
		departmentdetails.add(dep);
		dep=new DepartmentDetails(2,"management");
		departmentdetails.add(dep);
		dep=new DepartmentDetails(3,"support");
		departmentdetails.add(dep);
		
	}
	public static void main(String[] args) {
	init();	
	
DepartmentService departmentdetails=new DepartmentServiceImpl();
/*DepartmentDetails dep=new DepartmentDetails(1,"production");
departmentdetails.add(dep);
dep=new DepartmentDetails(2,"management");
departmentdetails.add(dep);
dep=new DepartmentDetails(3,"support");
departmentdetails.add(dep);
dep=new DepartmentDetails(1,"systemanalyst");
departmentdetails.update(dep);
departmentdetails.delete(1);
departmentdetails.display();*/
}
}