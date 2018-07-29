package demo;

import java.util.Scanner;

public class Test {

public static void main (String[]args){
	Scanner scan=new Scanner(System.in);
	System.out.println("eneter 1st no to add");
	int a=scan.nextInt();
	System.out.println("enter 2nd no");
	int b=scan.nextInt();
	int c=a+b;
	System.out.println(c);
	System.out.println("enter ur name");
	String d=scan.next();
	System.out.println("ur no is"+d);
	
}
}

