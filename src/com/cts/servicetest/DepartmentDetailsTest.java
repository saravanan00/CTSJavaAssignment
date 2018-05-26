package com.cts.servicetest;

import com.cts.bean.DepartmentDetails;
import com.cts.bean.EmployeeDetails;
import com.cts.service.DepartmentDetailsService;
import com.cts.service.EmployeeDetailsService;
import com.cts.serviceimpl.DepartmentDetailsServiceImpl;
import com.cts.serviceimpl.EmployeeDetailsServiceImpl;

public class DepartmentDetailsTest {
	private  static EmployeeDetailsService employeeservice;	
	private static DepartmentDetailsService departmentdetails;

	public static void init() {
		employeeservice=new EmployeeDetailsServiceImpl();
		departmentdetails=new DepartmentDetailsServiceImpl(employeeservice);
		
		employeedetails=new EmployeeDetailsServiceImpl();
		EmployeeDetails emp=new 	EmployeeDetails(1,"sara",50000);
		employeedetails.add(emp);
		emp=new EmployeeDetails(2,"dinesh",6000);
		employeedetails.add(emp);
		
		departmentdetails=new DepartmentDetailsServiceImpl();
		DepartmentDetails dep=new DepartmentDetails(1,"production");
		departmentdetails.add(dep);
		dep=new DepartmentDetails(2,"management");
		departmentdetails.add(dep);
		dep=new DepartmentDetails(3,"support");
		departmentdetails.add(dep);
		
	}
	public static void main(String[] args) {
	init();	
	
DepartmentDetailsService departmentdetails=new DepartmentDetailsServiceImpl();
/*DepartmentDetails dep=new DepartmentDetails(1,"production");
departmentdetails.add(dep);
dep=new DepartmentDetails(2,"management");
departmentdetails.add(dep);
dep=new DepartmentDetails(3,"support");
departmentdetails.add(dep);*/
dep=new DepartmentDetails(1,"systemanalyst");
departmentdetails.update(dep);
departmentdetails.delete(1);
departmentdetails.display();
}
}