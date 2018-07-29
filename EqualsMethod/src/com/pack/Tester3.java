package com.pack;

public class Tester3 {

	public static void main(String[] args) {
		
		Book b1 = new Book("title1", 56);
		Book b2 = new Book("title2", 47);
		Book b3 = new Book("title1", 56);
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		
		System.out.println(b1);
		
	}

}
