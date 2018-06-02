package com.cts.hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cts.bean.DepartmentDetails;
import com.cts.bean.EmployeeDetails;
import com.cts.oops.Employee;
import com.cts.service.DepartmentService;
import com.cts.service.EmployeeService;

public class DepartmentServiceImplHash implements DepartmentService {
	Map<Integer, DepartmentDetails> deptMap;
	private EmployeeService empservice;

	public DepartmentServiceImplHash(EmployeeService empservice) {
		deptMap = new HashMap<Integer, DepartmentDetails>();
		//empservice = new EmployeeServiceImplHash();
		this.empservice = empservice;
	}
	@Override
	public boolean add(DepartmentDetails department) {
		if(deptMap!=null){
		if (deptMap.containsKey(department)) {
			return false;
		}}
		deptMap.put(department.getId(), department);
		return true;
	}

	@Override
	public boolean update(DepartmentDetails department) {
		if (deptMap.containsKey(department.getId())) {
			deptMap.remove(department);
			deptMap.put(department.getEmployeedetails(), department);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int departmentId) {
		if (deptMap.containsKey(departmentId)) {
			deptMap.remove(departmentId);
		}
		return false;
	}

	@Override
	public DepartmentDetails getdep(int departmentId) {
		DepartmentDetails dept = null;
		if (deptMap.containsKey(departmentId)) {
			dept = deptMap.get(departmentId);
		}
		return dept;
	}

	@Override
	public void getAllDepartmentName() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display(DepartmentDetails dep) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean addEmployeeDetailsToDepartment(int empId, int deptId) {
		EmployeeDetails emp = empservice.get(empId);
		DepartmentDetails dep = getdep(deptId);
		List<Employee> empList = getEmployees(deptId);
		if (emp == null || dep == null) {
			return false;
		}
		//HashMap<Integer, Employee> empMap = new HashMap<Integer, Employee>();
		/*if (empList != null) {
			for (Employee employee : empList) {
				empMap.put(employee.getId(), employee);
			}
		} else*/
		if(empList==null){
			empList = new ArrayList<Employee>();
		}
		empList.add(emp);
		dep.setEmployeedetails(empList);
		deptMap.put(deptId, dep);

		return true;

	}

	/*public boolean isExist(int empId, int DeptId) {
		List<Employee> Emplist = getEmployees(DeptId);
		HashMap<Integer, Employee> empMap = new HashMap<Integer, Employee>();
		if (Emplist == null) {
			return false;
		}
		for (Employee emp : Emplist) {
			empMap.put(emp.getId(), emp);
		}
		if (empMap.containsKey(empId)) {
			return true;
		}
		return false;
	}*/

	@Override
	public boolean deleteEmployeeDetailsfromDepartmentDetails(int deptId, int empId) {
		Employee emp = empservice.get(empId);
		DepartmentDetails dep = getdep(deptId);
		List<Employee> empList = getEmployees(deptId);
		if (emp == null || dep == null) {
			return false;
		}		
		if(empList==null){
			empList = new ArrayList<Employee>();
			}
		empList.remove(emp);
			return true;
	}

	@Override
	public List<DepartmentDetails> getdepartment() {
		Collection<DepartmentDetails> Dept = deptMap.values();
		ArrayList<DepartmentDetails> listOfDept = new ArrayList<>(Dept);
		return listOfDept;
	}

	@Override
	public List<EmployeeDetails> getEmployees(int DeptId) {
		List<DepartmentDetails> DList = getemployeedetails();
		for (DepartmentDetails dept : DList) {
			if (DeptId == dept.getId()) {
				return dept.getEmployeedetails();
			}
		}
		return null;
	}

	@Override
	public List<EmployeeDetails> getEmployees(int deptId, int amount) {
		List<Employee> salaryList=new ArrayList<Employee>();
		DepartmentDetails dep=getdep(deptId);
		
		List<EmployeeDetails> EmpList=dep.getEmployeedetails();
		for(EmployeeDetails emp:EmpList){
			if(emp.getSalary()>amount){
				salaryList.add(emp);
			}
		}		
		return salaryList; 
	}

	@Override
	public List<EmployeeDetails> getEmployees(int deptId, int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override

	public void display() {
		// TODO Auto-generated method stub

	}

}