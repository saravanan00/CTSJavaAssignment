package com.cts.service;

import java.util.List;

import com.cts.bean.EmployeeDetails;

public interface EmployeeDetailsService {
public boolean add(EmployeeDetails emp);
public boolean update(EmployeeDetails emp);
public boolean delete(int id);
public EmployeeDetails get(int id);
 public List<EmployeeDetails> get();
 public void display(List<EmployeeDetails> empList);
 }
