package com.cts.servicetest;

import com.cts.bean.EmployeeDetails;
import com.cts.serviceimpl.EmployeeServiceImpl;

public class EmployeeDetailsTest {

	public static void main(String[]args)
	{
		EmployeeServiceImpl employeedetails=new EmployeeServiceImpl();
		EmployeeDetails emp=new EmployeeDetails(10,"sara",50000,1);
		EmployeeDetails emp1=new EmployeeDetails(20,"dinesh",6000,3);
		EmployeeDetails emp2 =new EmployeeDetails(30,"rev",89009,2);
		
		
		
		System.out.println("adding new row");
		
		//employeedetails.update(emp);
		//employeedetails.display();
		System.out.println("updating new row");
		//employeedetails.delete(1);
		//employeedetails.display();
		System.out.println("deleting new row");
		
		employeedetails.add(emp);
		employeedetails.add(emp1);
		employeedetails.add(emp2);
	}
}
