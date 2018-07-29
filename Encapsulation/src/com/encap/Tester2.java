package com.encap;

public class Tester2 {

	public static void main(String[] args) {
		
		Address address = new Address();
		address.setCity("cuttack");
		address.setPin(6574);
		
		Employee employee = new Employee();
		employee.setName("ram");
		employee.setEmpId(54636);
		employee.setAddress(address);
		
		System.out.println(employee.getName());
		System.out.println(employee.getEmpId());
		System.out.println(employee.getAddress().getCity());
		System.out.println(employee.getAddress().getPin());

	}

}
