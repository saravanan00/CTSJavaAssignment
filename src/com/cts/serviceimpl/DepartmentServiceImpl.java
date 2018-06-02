package com.cts.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.cts.bean.DepartmentDetails;
import com.cts.bean.EmployeeDetails;
import com.cts.service.DepartmentService;
import com.cts.service.EmployeeService;

public class DepartmentServiceImpl implements DepartmentService{
private List<DepartmentDetails> deplist;
EmployeeService employeeservice;

public  DepartmentServiceImpl() {
	employeeservice=new EmployeeServiceImpl();
	deplist=new ArrayList<DepartmentDetails>();
}


	public DepartmentServiceImpl(EmployeeService employeeservice) {
		deplist=new ArrayList<DepartmentDetails>();
	this.employeeservice = employeeservice;
}


	@Override
	public Boolean add(DepartmentDetails dept) {
		if(getdep(dept.getId())!=null) 
		{
			return false;
		}
		else 
			deplist.add(dept);
		
		// TODO Auto-generated method stubs
		return true;}


	
	@Override
	public List<DepartmentDetails> getAllDepartmentsDetails() {
		
		return deplist;
	}

	@Override
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		if(getdep(id)==null)
			return false;
			deplist.remove(getdep(id));
			return true;
	}

	@Override
	public Boolean update(DepartmentDetails dept) {
		if(getdep(dept.getId())==null)
		// TODO Auto-generated method stub
		return false;
		DepartmentDetails deptdetails=getdep(dept.getId());
		deplist.remove(deptdetails);
		deplist.add(dept);
		return true;
	
	}

	@Override
	public DepartmentDetails getdep(int deptid) {
		for(DepartmentDetails dept:deplist)
		{
			if(dept.getId()==deptid)
			
				return dept;
				}	// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addEmployeeDetailsToDepartment(int empID, int deptID) {

		 
				EmployeeDetails emp = employeeservice.get(empID);
				DepartmentDetails dep = getdep(deptID);
				
				if(isExist(empID, deptID)){
					return false;
				}
				deplist.remove(dep);
				if (emp == null || dep == null) {
					return false;
				}
				List<EmployeeDetails> empList = getEmployees(deptID);
				if (empList == null) {
					empList = new ArrayList<EmployeeDetails>();
				}
				empList.add(emp);
				dep.setEmployeedetails(empList);
				deplist.add(dep);
				return true;
			}
	
	@Override
	public boolean isExist(int empId, int DeptId) {
		List<EmployeeDetails> Emplist = getEmployees(DeptId);
		if (Emplist == null) {
			return false;
		}
		for (EmployeeDetails emp : Emplist) {
			if (emp.getId() == empId) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Boolean deleteEmployeeFromDepartment(int empID, int deptID) {
		EmployeeDetails emp = employeeservice.get(empID);
	DepartmentDetails dep = getdep(deptID);
	if (emp == null || dep == null) {
		return false;
	}
	List<EmployeeDetails> empList = getEmployees(deptID);
	if (empList == null) {
		empList = new ArrayList<EmployeeDetails>();
	}
	isExist(empID, deptID);
	empList.remove(emp);
	// dep.setEmployeeList(empList);
	// DeptList.add(dep);
	return true;
}
	

	@Override
	public List<EmployeeDetails> getAllEmployeesDetails(int deptID) {
		
			List<DepartmentDetails> department=getAllDepartmentsDetails();
			for(DepartmentDetails list:department)
				if(deptID==list.getId())
				{
					return list.getEmployeedetails();
				}
			
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
	public List<DepartmentDetails> getdepartment() {
		// TODO Auto-generated method stub
		return deplist;
	}
	@Override
	public DepartmentDetails Departmnet(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	/*@Override
	public List<EmployeeDetails> getEmployees(int DeptId) {
		// TODO Auto-generated method stub
		return null;
	}*/


	@Override
	public List<EmployeeDetails> getEmployees(int deptId, int amount) {
		{
			List<EmployeeDetails> salaryList=new ArrayList<EmployeeDetails>();
			DepartmentDetails department=getdep(deptId);
			
			List<EmployeeDetails> empList=department.getEmployeedetails();
			for(EmployeeDetails emp:empList){
				if(emp.getSalary()>=amount){
					salaryList.add(emp);
				}
			}
			
			return salaryList;
		
		}}


	@Override
	public List<EmployeeDetails> getEmployees(int deptId, int min, int max) {
		List<EmployeeDetails> salaryList=new ArrayList<EmployeeDetails>();
		DepartmentDetails department=getdep(deptId);
		
		List<EmployeeDetails> empList=department.getEmployeedetails();
		for(EmployeeDetails emp:empList){
			if(emp.getSalary()>min && emp.getSalary()<max){
				salaryList.add(emp);
			}
		}
		
		return salaryList;
		
	}


	@Override
	public void getAllDepartmentName() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<EmployeeDetails> getEmployees(int DeptId) {
		// TODO Auto-generated method stub
		return null;
	}

}
