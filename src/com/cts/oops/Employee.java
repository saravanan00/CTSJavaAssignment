package com.cts.oops;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private Address address; 
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public  void display(Address ss)
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		ss.setCity("chennai");
		ss.setPincode(628902);
		ss.setStreet("northextension");
		System.out.println("city:" + ss.getCity() +"pincode:"+ss.getPincode()+"street:"+ ss.getStreet()); 
	}
	

}
