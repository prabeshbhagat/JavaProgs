package com.pack;

public class Tester1 {

	public static void main(String[] args) {
		int[] a = new int[5];
		
		a [0] = 5;
		a [1] = 7;
		a [2] = 3;
		a [3] = 9;
		a [4] = 2;
		
		System.out.println(a[4]);
		
		for (int i = 0; i<= a.length-1; i++){
			System.out.println(a[i]);
		}
		
	}

}
