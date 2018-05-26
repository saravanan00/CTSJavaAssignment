package com.cts.service;

import java.util.List;

import com.cts.bean.DepartmentDetails;
import com.cts.bean.EmployeeDetails;

public interface DepartmentDetailsService {
        public Boolean add(DepartmentDetails dept);
		public DepartmentDetails Departmnet(int id);
		public List<DepartmentDetails > getAllDepartmentsDetaisl();
		public Boolean delete(int id); 
		public Boolean update(DepartmentDetails dept);
		public DepartmentDetails get(int deptid);
		
		public Boolean  addEmployeeDetails(int empID, int deptID);
		public Boolean  deleteEmployeeDetails(int empID, int deptID);
		public List<EmployeeDetails>  getAllEmployeesDetails(int deptID);
		public void display(DepartmentDetails dept);
		public void display();
		}
