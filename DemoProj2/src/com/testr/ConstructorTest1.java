package com.testr;

public class ConstructorTest1 {

	public static void main(String[] args) {
		
		Box b1 = new Box(10,12,3);
		b1.getArea();
		Box b2 = new Box(5);
		b2.getArea();
	}

}

class Box{
	
	int length;
	int breadth;
	int height;
	
	public Box(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
		System.out.println("3 arg object created...");
	}
	public Box(int a) {
		breadth=height=length= a;
		System.out.println("cube object created...");
	}
	
	public void getArea(){
		System.out.println("area = "+(breadth*height*length));
	}
}