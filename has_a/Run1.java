package com.ojm18.has_a;

public class Run1 {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "xyz abc";
		s.rollNo = 15;
		s.a = new Address();
		s.a.city = "bnglr";
		s.a.area = "jvngr";
		s.a.pin = 755019;
		System.out.println(s.name+s.rollNo+s.a.city+s.a.area+s.a.pin);
	}

}
