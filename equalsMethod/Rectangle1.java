package com.ojm18.equalsMethod;

public class Rectangle1 {
	int length;
	int breadth;
	
	Rectangle1(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public String toString()
	{
		return length+","+breadth;
	}
	public boolean equals(Object x)
	{
		if (x == null) return false;
		if (!(x instanceof Rectangle1)) return false;
		if (x == this) return true;
		Rectangle1 rec1 = (Rectangle1)x;
		return length == rec1.length && breadth == rec1.breadth;
	}
}
