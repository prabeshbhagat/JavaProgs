package com.ojm18.array;

public class DreivedTypeArraysDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen[] pn = {new Pen("red",10), new Pen("blue",12), new Pen("black",15) };
	
	for(Pen pnp : pn){
		System.out.println(pnp);
	}
}
}

class Pen{
	String inkColor;
	int price;
	Pen(String s, int p){
		inkColor = s;
		price = p;
	}
	public String toString(){
		return "["+inkColor+","+price+"]";
	}
}

