package com.ojm18.has_a;

public class Run {

	public static void main(String[] args) {
		
		A a = new A();
		a.test1();
		a.b.test1();
		a.b.x = 10;
		System.out.println(a.b.x);
	}

}
