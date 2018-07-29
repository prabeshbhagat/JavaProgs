package com.ojm18.array;

import java.util.Arrays;

public class UsingSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {10,8,6,7,15,19,3};
		
		Arrays.sort(a);
		System.out.println("sorted array: ");
		for(int i : a){
			System.out.println(i);
		}
		
	}

}
