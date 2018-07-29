package com.abstr3;

public class Tester1 {

	public static void main(String[] args) {
	//	A a = new A();
		B b = new B();
	}

}

abstract class A {
	
	void m1(){System.out.println("m1 method..");}
	void m2(){System.out.println("m2 method..");}
	
	
	
}

class B extends A{

		
}