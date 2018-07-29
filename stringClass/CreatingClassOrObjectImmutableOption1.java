package com.ojm18.stringClass;

public class CreatingClassOrObjectImmutableOption1 {
	
	public final int length;
	public final int breadth;
	
	CreatingClassOrObjectImmutableOption1(int l, int b){

		length  = l;
		breadth = b;
	
	}
	public String toString(){
		return length+","+breadth;
	}
}
