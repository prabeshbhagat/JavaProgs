package com.abstr1;

public class Tester1 {

	public static void main(String[] args) {
		
	//	A a1 = new A(); can not create object of A
		C c = new C();
		c.m1();
		
	}

}

abstract class A{
	abstract void m1(); // incomplete method
}

abstract class B extends A{
	
}

class C extends A{
	@Override
	void m1() {
		System.out.println("impleted...");
	}
}