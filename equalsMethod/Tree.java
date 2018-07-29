package com.ojm18.equalsMethod;

public class Tree {
	
	int height ;
	Tree(int height)
	{
		this.height=height;
	}
	public String toString()
	{
		return height+"";
	}
	public boolean equals(Object x)
	{
		return this.height == ((Tree)x).height;
	}
	
}