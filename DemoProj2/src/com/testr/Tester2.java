package com.testr;

public class Tester2 {

	public static void main(String[] args) {
		
		Box1 b1 = new Box1(12,10,2);
		System.out.println(b1.length+"  "+b1.height+"  "+b1.breadth);
		
	}

}

class Box1{
	
	
	int length;
	int breadth;
	int height;

	public Box1(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	
	
}