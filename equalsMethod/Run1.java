package com.ojm18.equalsMethod;

public class Run1 {

	public static void main(String[] args) {
		
		Tree t1 = new Tree(10);
		System.out.println(t1);
		Tree t2 = new Tree(10);
		System.out.println(t2);
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		
	}

}
