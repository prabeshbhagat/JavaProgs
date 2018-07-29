package com.ojm18.stringClass;
import java.util.Scanner;

public class IsPalindromWithoutReversing {

	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		s1 = s1.toLowerCase();
		int n = s1.length();
		int flag = 1;
		for(int i=0;i<n/2;i++){
			if(s1.charAt(i) != s1.charAt(n-1-i)){
				flag = 0;
				break;
			}
		}
		
		if(flag == 1) {
			System.out.println("palindrom");
			}else{
				System.out.println("not palindrom");
			}
		}
	}