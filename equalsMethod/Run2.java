package com.ojm18.equalsMethod;

public class Run2 {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(15, 10);
		System.out.println(r1);
		Rectangle r2 = new Rectangle(15, 10);
		System.out.println(r2);
		Rectangle r3 = new Rectangle(18, 12);
		System.out.println(r3);
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
	}

}
