package demo;

import java.util.Scanner;

public class Greater {
public static void main(String []args){
	Scanner som=new Scanner (System.in);
	System.out.println("Enter Your  Name");
	String a=som .next();
	System.out.println("Welcome"+a);
	System.out.println("Enter 1st No");
	int b=som.nextInt();
	System.out.println("Enter 2nd No");
	int c = som.nextInt();
	if(b>c)
	{
		System.out.println("1st No. is Greater");
	}
	else if(c>b)
	{
		System.out.println("2nd No. is Greater");
	}
	else{
		System.out.println("no's r equal");
	}
}
}
