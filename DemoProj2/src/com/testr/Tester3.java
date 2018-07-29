package com.testr;

public class Tester3 {

	public static void main(String[] args) {

		Aa a1 = new Aa();
	}

}

class Aa{
	
	public Aa() {
		this(5);
		System.out.println("no atgs ctt");
	}
	
	public Aa(int a) {
		this(5,46);
		System.out.println("single arg ctt..");
	}
	
	public Aa(int a, int b) {
		System.out.println("double arg ctt...");
	}
	
	
}