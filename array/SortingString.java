package com.ojm18.array;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		String s1 = "i am an idiot";
		String [] arr = s1.split(" ");
		
		Arrays.sort(arr);
		
		for(String smn : arr){
			System.out.println(smn);
		}

	}

}
