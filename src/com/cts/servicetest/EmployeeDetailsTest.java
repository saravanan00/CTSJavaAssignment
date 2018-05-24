package com.cts.servicetest;

import com.cts.bean.EmployeeDetails;
import com.cts.serviceimpl.EmployeeDetailsServiceImpl;

public class EmployeeDetailsTest {

	public static void main(String[]args)
	{
		EmployeeDetailsServiceImpl employeedetails=new EmployeeDetailsServiceImpl();
		EmployeeDetails emp=new 	EmployeeDetails(1,"sara",50000);
		employeedetails.add(emp);
		emp=new EmployeeDetails(2,"dinesh",6000);
		employeedetails.add(emp);
		System.out.println("adding new row");
		emp=new EmployeeDetails(1,"rev",89009);
		employeedetails.update(emp);
		employeedetails.display();
		System.out.println("updating new row");
		employeedetails.delete(1);
		employeedetails.display();
		System.out.println("deleting new row");
		
		
	}
}
