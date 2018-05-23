package com.cts.oops;

import com.cts.oopstest.EmployeeTest;

public class ContractEmployee extends Employee {

	private int duration;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void display()
	{
		System.out.println(duration);
	}
}
