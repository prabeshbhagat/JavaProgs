package com.ojm18.Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeTreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
		Employee1 e1 = new Employee1("ram", 2011, 1200.35);
		Employee1 e2 = new Employee1("sam", 2010, 12050.35);
		Employee1 e3 = new Employee1("dam", 2019, 12080.35);
		Employee1 e4 = new Employee1("ram", 2011, 1200.35);
		Employee1 e5 = new Employee1("vam", 2011, 1200.36);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		for (Object x:ts){
			System.out.println(x);
		}
	}

}
class Employee1 implements Comparable {
	String name;
	int jy;
	double sal;
	Employee1(String n,int j,double s){
		name = n;
		jy = j;
		sal = s;
	}
	public boolean equals(Object x){
		Employee1 e = (Employee1) x;
		return this.name.equals(e.name) && this.jy == e.jy && this.sal == e.sal;				
	}
	public int hashCode(){
		return jy; 
	}
	public String toString(){
		return "["+name+","+jy+","+sal+"]";
	}
	public int compareTo(Object x){
		Employee1 e = (Employee1)x;
		return name.compareTo(e.name);
	}
}