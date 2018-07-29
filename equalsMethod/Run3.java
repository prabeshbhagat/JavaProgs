package com.ojm18.equalsMethod;

public class Run3 {

	public static void main(String[] args) {
		
		Rectangle1 rec1 = new Rectangle1(15, 10);
		Rectangle1 rec2 = new Rectangle1(15, 10);
		Rectangle1 rec3 = new Rectangle1(18, 12);
		Rectangle1 rec4 = null;
		Tree t1 = new Tree(15);
		System.out.println(rec1.equals(rec2));
		System.out.println(rec1.equals(rec3));
		System.out.println(rec1.equals(rec4));
		System.out.println(rec1.equals(t1));
		
		
	}

}
