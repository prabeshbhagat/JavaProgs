package com.ojm18.Exceptions;

public class PropagationDemo {

	public static void main(String[] args) {
		
		test1();
		
	}
	static void test1(){
		try{
			test2();
		}catch(ArithmeticException e){
			System.out.println("exception handled in test1");
		}
	}
	static void test2(){
		int i = 10/0;
	}

}
