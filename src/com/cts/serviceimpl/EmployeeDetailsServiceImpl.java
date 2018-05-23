package com.cts.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.cts.bean.EmployeeDetails;
import com.cts.service.EmployeeDetailsService;

public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {
	private List<EmployeeDetails> emplist; // constructor

	public EmployeeDetailsServiceImpl() {
		emplist = new ArrayList<EmployeeDetails>();

	}

	@Override
	public boolean add(EmployeeDetails emp) {
		if(get(emp.getId())!=null)
		return false;
		emplist.add(emp);
		return true;
	}

	@Override
	public boolean update(EmployeeDetails emp) {
		if(get(emp.getId())==null)
			return false;
		// TODO Auto-generated method stub
		
		emplist.add(emp);
		return true;

	}

	@Override
	public boolean delete(int id) {
		if(get(id)==null)
			
		return false;
		emplist.remove(get(id));
		return true;
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
	public void display(List<EmployeeDetails> emplist) {
		
		
		
	for(EmployeeDetails emp :emplist )
	{
		view(emp);
	}
	}

}
