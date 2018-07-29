package com.pack;

public class A {
	
	int a;
	int b;
	
	public A(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		A a1 = (A) obj;
		return a == a1.a && b == a1.b;
	}
	
}
