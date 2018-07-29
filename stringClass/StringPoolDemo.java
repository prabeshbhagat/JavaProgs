package com.ojm18.stringClass;

public class StringPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
		
		System.out.println(s1 == s1);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		
	}

}
