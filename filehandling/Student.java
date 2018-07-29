package com.ojm18.filehandling;

import java.io.Serializable;

public class Student implements Serializable{
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "," + age;
	}
}
