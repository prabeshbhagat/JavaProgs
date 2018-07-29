package com.ojm18.Exceptions;

public class Demo1 {

	public static void main(String[] args) {
		
		System.out.println("main starts");
		int i = 10;
		int j = 0;
		int k;
		try {
			System.out.println("try start");
			k = i/j;
			System.out.println("try ends");
		} catch (ArithmeticException e) {
			System.out.println("executing catch");
			k = i/2;
		}finally{
			System.out.println("finally executes..");
		}
		
	}

}
