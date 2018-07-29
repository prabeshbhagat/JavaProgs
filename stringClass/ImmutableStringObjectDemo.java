package com.ojm18.stringClass;

public class ImmutableStringObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ab";
		String s2;
		s2 = s1;
		s1 = s1 + 'c';
		System.out.println(s1 +" & "+ s2);
	}

}
