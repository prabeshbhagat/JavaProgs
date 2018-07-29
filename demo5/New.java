package demo5;

import java.util.Scanner;

public class New {

	public static void main(String[] args) {
Scanner scn =new Scanner(System.in);
System.out.println("please enter a string");
String a=scn.next();
String b="";
for(int i=a.length()-1;i>=0;i--){
	b+=a.charAt(i);

}
System.out.println(b);
	}

}
