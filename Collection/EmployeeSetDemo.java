package com.ojm18.Collection;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo {

	public static void main(String[] args) {
		Set s = new HashSet();
		Employee e1 = new Employee("ram", 2011, 1200.35);
		Employee e2 = new Employee("sam", 2010, 12050.35);
		Employee e3 = new Employee("dam", 2019, 12080.35);
		Employee e4 = new Employee("ram", 2011, 1200.35);
		Employee e5 = new Employee("vam", 2011, 1200.36);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
		for (Object x:s){
			System.out.println(x);
		}
		System.out.println(e1.hashCode()==e5.hashCode());
		System.out.println(e1.equals(e4));
	}

}
class Employee{
	String name;
	int jy;
	double sal;
	Employee(String n,int j,double s){
		name = n;
		jy = j;
		sal = s;
	}
	public boolean equals(Object x){
		Employee e = (Employee) x;
		return this.name.equals(e.name) && this.jy == e.jy && this.sal == e.sal;				
	}
	public int hashCode(){
		return jy; 
	}
	public String toString(){
		return "["+name+","+jy+","+sal+"]";
	}
}