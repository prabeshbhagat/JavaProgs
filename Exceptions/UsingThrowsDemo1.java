package com.ojm18.Exceptions;

public class UsingThrowsDemo1 {

	public static void main(String[] args) {
		
		test1();
		
	}
	static void test1(){
		try {
			test2();
		} catch (InterruptedException e) {
			System.out.println(" test2 exception handled");
		}
	}
	
	static void test2() throws InterruptedException{
		System.out.println("test2 start");
		Thread.sleep(2000);
		System.out.println("test2 end");
	}
}
