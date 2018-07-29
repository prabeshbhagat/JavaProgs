package com.ojm18.stringClass;

public class SpiltMethodDemo {

	public static void main(String[] args) {
		
		String s1 = "i am a looser";
		String [] s2 = s1.split(" ");
		
		for (String sr : s2){
			System.out.println(sr);
		}
	
		String s3 = "i am a looser";
		String [] arr = s1.split(" ");
		String s4 = " ";
		
		for (int i = arr.length-1; i >=0; i--){
			System.out.println(arr[i]);
		}
		
		for (int i = arr.length-1; i >=0; i--){
			s4 += arr[i];
			s4 += " ";
		}
		System.out.println(s4);
	}

}