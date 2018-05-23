package com.cts.oopstest;

import com.cts.oops.Address;
import com.cts.oops.ContractEmployee;
import com.cts.oops.Employee;

public class EmployeeTest {
	
public static void main(String[]args)
{
	Employee ss=new Employee();
	Employee emp=new Employee();
	Employee emp1=new Employee();
	Address address=new Address();
System.out.println(emp);
System.out.println();
	System.out.println(emp.equals(emp1));
	ss.setId(1);
	ss.setName("sara");
	ss.setSalary(10000);
	ss.display(address);
	
	ContractEmployee contractemployee=new ContractEmployee();
	contractemployee.setDuration(250);
	contractemployee.setId(1);
	contractemployee.setName("sara");
	contractemployee.setSalary(10000);
	contractemployee.display();
	String s1= ("hello");
	String s2=("hello");
	if(s1.equals(s2))
	{
		System.out.println("true");}
	else {
		
		
			
		System.out.println("false");
		
		}
	}

}
