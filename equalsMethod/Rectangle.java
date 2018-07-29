package com.ojm18.equalsMethod;

public class Rectangle {
	
	int length;
	int breadth;
	
	Rectangle(int length,int breadth)
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
		return this.length == ((Rectangle)x).length && this.breadth == ((Rectangle)x).breadth;
	}

}
