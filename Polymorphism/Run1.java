package com.ojm18.Polymorphism;

public class Run1 {

	public static void main(String[] args) {
		
	
	
	A a1 = new B();
	a1.m1();
	
	}

}


 class A {

	void m1(){
		System.out.println("m1 in A");
	}
	
}

class B extends A {
	
	void m1(){
		System.out.println("m1 in B");
	}
	
		
}

class C extends A{
	
	void m3(){
		System.out.println("m3 in C");
	}
	
	
}