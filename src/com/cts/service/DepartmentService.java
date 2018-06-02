package com.cts.service;

import java.util.List;

import com.cts.bean.DepartmentDetails;
import com.cts.bean.EmployeeDetails;

public interface DepartmentService {
        public Boolean add(DepartmentDetails dept);
		public DepartmentDetails Departmnet(int id);
		public List<DepartmentDetails > getAllDepartmentsDetails();
		public Boolean delete(int id); 
		public Boolean update(DepartmentDetails dept);
		public DepartmentDetails getdep(int deptid);
		public boolean isExist(int empId, int DeptId);
		public void getAllDepartmentName();
		public Boolean  addEmployeeDetailsToDepartment(int empID, int deptID);
		public Boolean  deleteEmployeeFromDepartment(int empID, int deptID);
		public List<EmployeeDetails>  getAllEmployeesDetails(int deptID);
		public void display(DepartmentDetails dept);
		public List<EmployeeDetails> getEmployees(int DeptId);
		public List<EmployeeDetails> getEmployees(int deptId,int amount);
		public List<EmployeeDetails> getEmployees(int deptId,int min,int max);
		public List<DepartmentDetails> getdepartment();
		public void display();
		}
