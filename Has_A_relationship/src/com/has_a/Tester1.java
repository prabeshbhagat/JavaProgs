package com.has_a;

public class Tester1 {

	public static void main(String[] args) {
		
		Address address = new Address("bnglr", 546);
		Dept dept = new Dept("bpo", 45);
		
		Employee employee = new Employee("ram", 111, address, dept);
		
		System.out.println(employee.name);
		System.out.println(employee.empId);
		System.out.println(employee.address.city);
		System.out.println(employee.address.pin);
		System.out.println(employee.dept.deptName);
		System.out.println(employee.dept.deptId);
		
		
	}

}

