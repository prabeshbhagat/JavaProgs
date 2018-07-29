package com.pack;

public class Tester {

	public static void main(String[] args) {
		
		A a1 = new A(5,8);
		A a2 = new A(5,9);
		
		
		System.out.println();
		System.out.println(a1 == a2); //false
		
		System.out.println(a1.equals(a2));
		
	}

}
