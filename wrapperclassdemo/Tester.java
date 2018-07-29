package com.ojm18.wrapperclassdemo;

public class Tester {

	public static void main(String[] args) {
		Object[] arr = new Object[5];
		arr[0] = 12;
		arr[1] = 12.35;
		arr[2] = 'g';
		arr[3] = "hgjhg";
		arr[4] = false;

		for (Object a : arr) {
			System.out.println(a);
		}
	}

}
