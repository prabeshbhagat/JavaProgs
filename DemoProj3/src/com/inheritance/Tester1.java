package com.inheritance;

public class Tester1 {

	public static void main(String[] args) {
		
		B b1 = new B();
		System.out.println(b1.a);
		System.out.println(b1.s1);
		System.out.println(b1.c);
		b1.m1();
		b1.m2();
	}

}

class A {
	
	int a = 5 ;
	String s1 = "ram";
	
	public void m1(){
		System.out.println("method in class A..");
	}
}

class B extends A {
	int c = 4;
	public void m2(){
		System.out.println("methd in class b..");
	}
}