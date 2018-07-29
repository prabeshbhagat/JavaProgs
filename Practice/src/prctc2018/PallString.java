package prctc2018;

import java.util.Scanner;

public class PallString {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("please enter a string");
String s1=scn.next();
String s2="";
for(int i=s1.length()-1;i>=0;i--){
	s2=s2+s1.charAt(i);}
	if(s1.equalsIgnoreCase(s2)){
	System.out.println("pallindrome");
		
	}
	else{
		System.out.println("not pallindrome");
	}
	}}

	


