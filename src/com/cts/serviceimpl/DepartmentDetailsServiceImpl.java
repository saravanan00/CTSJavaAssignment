package com.cts.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.cts.bean.DepartmentDetails;
import com.cts.bean.EmployeeDetails;
import com.cts.service.DepartmentDetailsService;
import com.cts.service.EmployeeDetailsService;

public class DepartmentDetailsServiceImpl implements DepartmentDetailsService{
private List<DepartmentDetails> deplist;
EmployeeDetailsService employeeservice;

public  DepartmentDetailsServiceImpl() {
	employeeservice=new EmployeeDetailsServiceImpl();
	deplist=new ArrayList<DepartmentDetails>();
}


	public DepartmentDetailsServiceImpl(EmployeeDetailsService employeeservice) {
		
	this.employeeservice = employeeservice;
}


	@Override
	public Boolean add(DepartmentDetails dept) {
		if(get(dept.getId())!=null)
		{
			return false;
		}
		else 
			deplist.add(dept);
		
		// TODO Auto-generated method stubs
		return true;}


	
	@Override
	public List<DepartmentDetails> getAllDepartmentsDetaisl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		if(get(id)==null)
			return false;
			deplist.remove(get(id));
			return true;
	}

	@Override
	public Boolean update(DepartmentDetails dept) {
		if(get(dept.getId())==null)
		// TODO Auto-generated method stub
		return false;
		DepartmentDetails deptdetails=get(dept.getId());
		deplist.remove(deptdetails);
		deplist.add(dept);
		return true;
	
	}

	@Override
	public DepartmentDetails get(int deptid) {
		for(DepartmentDetails dept:deplist)
		{
			if(dept.getId()==deptid)
			
				return dept;
				}	// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addEmployeeDetails(int empID, int deptID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteEmployeeDetails(int empID, int deptID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDetails> getAllEmployeesDetails(int deptID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display(DepartmentDetails dept) {
		System.out.println(dept.getId());
        System.out.println(dept.getName());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for(DepartmentDetails dd:deplist)
			display(dd);
	}

	@Override
	public DepartmentDetails Departmnet(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
