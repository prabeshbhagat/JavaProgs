package com.ojm18.array;

public class BiggestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,12,8,15,75};
		int big = 0;
		System.out.println("using for loop");
		for(int i = 0; i<a.length; i++){
			if(big<a[i]){
				big = a[i];
			}
		}

		System.out.println(big);
		System.out.println("using for each loop");
		for (int i:a){
			if(i>big){
				big = i;
			}
		}
		System.out.println(big);
	}

}
