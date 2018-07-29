package com.has_a;

import java.io.PrintStream;

public class Employee {
	
	String name;
	int empId;
	
	
	
	Address address;
	
	Dept dept;

	public Employee(String name, int empId, Address address, Dept dept) {
		this.name = name;
		this.empId = empId;
		this.address = address;
		this.dept = dept;
	}
	
	
	
}
