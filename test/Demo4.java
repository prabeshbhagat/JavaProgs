package test;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("please enter a string");
String s1=scn.next();
s1=s1.toLowerCase();
int n=s1.length();
for(int i=0;i<n/2;i++){
	if(s1.charAt(i)==s1.charAt(n-1-i)){
		System.out.println("pallindrome");
		break;
	}
	else{
		System.out.println("not pallindrome");
		break;
	}
}
	}

}
