package demopack1;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scn.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--){
			s2=s2+s1.charAt(i);
		}
        System.out.println(s2);
        
	}

}
