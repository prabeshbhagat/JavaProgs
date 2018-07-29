package com.ojm18.stringClass;

public class IndexOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java developer";
		System.out.println(s1.indexOf('v')); //2
		System.out.println(s1.indexOf('j')); //0
		System.out.println(s1.indexOf(' ')); //4
		System.out.println(s1.indexOf('z')); //-1
		
		System.out.println(s1.indexOf("dev")); //5
		System.out.println(s1.indexOf("xyz")); //-1
		
		System.out.println(s1.indexOf('a',2)); //3
		System.out.println(s1.indexOf('e',2)); //6
		System.out.println(s1.indexOf('e',11)); //12
		System.out.println(s1.indexOf('a',1)); //1
		System.out.println(s1.indexOf("dev",3));//5
	}

}
