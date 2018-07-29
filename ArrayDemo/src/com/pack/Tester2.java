package com.pack;

public class Tester2 {

	public static void main(String[] args) {
		
		Book b1 = new Book("title1", 56);
		Book b2 = new Book("title2", 47);
		Book b3 = new Book("title3", 56);
		
		Book [] barr = new Book[3];
		barr[0] = b1;
		barr[1] = b2;
		barr[2] = b3;
		
		for (int i = 0; i < barr.length; i++){
			System.out.println(barr[i]);
		}
		
		Book[] barr1 = {b1,b2,b3};
		System.out.println();
		System.out.println("another method...");
		System.out.println();
		for (int i = 0; i < barr.length; i++){
			System.out.println(barr[i]);
		}
		
	}
		
		
		

}
