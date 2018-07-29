package com.abstr2;

public class Tester1 {

	public static void main(String[] args) {

	}

}

abstract class A {
	void m1(){System.out.println("m1 method..");}
	void m2(){System.out.println("m2 method..");}
	
	abstract void m3();
	abstract void m4();
	
}

class B extends A{

	@Override
	void m3() {
	}

	@Override
	void m4() {
	}
	
}