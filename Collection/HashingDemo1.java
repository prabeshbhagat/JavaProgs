package com.ojm18.Collection;

import java.util.HashSet;
import java.util.Set;

public class HashingDemo1 {

	public static void main(String[] args) {
		
		Set s =new HashSet();
		s.add(new Student("sam",15,95));
		s.add(new Student("ram",16,96));
		s.add(new Student("sam",15,95));
		
		System.out.println(s.size());
		for (Object ele:s){
			System.out.println(ele);
		}
		for (Object ele:s){
			System.out.println(ele.hashCode());
		}
	}

}

class Student{
	String name;
	int age;
	int marks;
	Student(String n,int a,int m){
		name = n;
		age = a;
		marks = m;
	}
	public String toString(){
		return "["+name+","+age+","+marks+"]";
	}
}