package com.blocks;

public class Tester1 {

	public static void main(String[] args) {
		
		A a = new A();
		A a1 = new A();
		A a2 = new A();
	}

}

class A{
	
	static {
		System.out.println("in static block 1");
	}
	
	static {
		System.out.println("in static block 2");
	}

	static {
		System.out.println("in static block 3");
	}
	
	{
		System.out.println("in non static block 1");
	}
	
	{
		System.out.println("in non static block 2");
	}
	
	{
		System.out.println("in non static block 3");
	}
	
}
