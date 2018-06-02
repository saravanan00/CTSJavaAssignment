package com.cts.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.bean.EmployeeDetails;
import com.cts.database.DBConnection;
import com.cts.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	private Connection con;
	private PreparedStatement preparestatement;
	private List<EmployeeDetails> emplist; // constructor

	public EmployeeServiceImpl() {
		emplist = new ArrayList<EmployeeDetails>();

	}

	@Override
	public boolean add(EmployeeDetails emp) {
		con=DBConnection.getConnection();
		
			try {
				preparestatement=con.prepareStatement("insert into employee values(?,?,?,?);");
				preparestatement.setInt(1, emp.getId());
				preparestatement.setString(2,emp.getName());
				preparestatement.setInt(3,emp.getSalary());		
				preparestatement.setInt(4,emp.getDeptId());
				preparestatement.executeUpdate();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			
	
		

		/*if(get(emp.getId())!=null)
		{
		return false;
		}
		else
		{
		emplist.add(emp);
		return true;
		}*/
	}

	@Override
	public boolean update(EmployeeDetails emp) {
		if(get(emp.getId())==null)
			return false;
		
	EmployeeDetails temp=get(emp.getId());
	emplist.remove(temp);
		// TODO Auto-generated method stub
		
		emplist.add(emp);
		return true;

	}

	@Override
	public boolean delete(int id) {
		con=DBConnection.getConnection();
		
		try {
			preparestatement=con.prepareStatement("delete from employee where id=?");
			
			preparestatement.executeQuery();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		/*
		if(get(id)==null)
			
		return false;
		emplist.remove(get(id));
		return true;*/
	}

	@Override
	public EmployeeDetails get(int id) {
		for(EmployeeDetails emp: emplist)
		{
			if(emp.getId()==id)
				return emp;
		}
		return null;
	}

	@Override
	public List<EmployeeDetails> get() {
		
		// TODO Auto-generated method stub
		return emplist;
	}
	public void view(EmployeeDetails emp) {
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	}

	@Override
	public void display() {
		for(EmployeeDetails dd:emplist)
		{
			view(dd);
		}
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public List<EmployeeDetails> getAllEmployees(int salary) {
		List<EmployeeDetails> salaryList=new ArrayList<EmployeeDetails>();
		for(EmployeeDetails emp:emplist)
		{
			if(emp.getSalary()>salary)
			{
				salaryList.add(emp);
				
			}
		}
		
		return salaryList;
	}

	@Override
	public List<EmployeeDetails> get(int min, int max) {
		List<EmployeeDetails> salarylist=new ArrayList<EmployeeDetails>();
		for(EmployeeDetails emp:emplist)
		{
			if(emp.getSalary()>min && emp.getSalary()>max)
			{
				salarylist.add(emp);
			}
				
		}
		return salarylist;
	}

	
	
	/*@Override
	public void display(List<EmployeeDetails> emplist) {
		
		
		
	for(EmployeeDetails emp :emplist )
	{
		view(emp);
	}
	}
*/
}
