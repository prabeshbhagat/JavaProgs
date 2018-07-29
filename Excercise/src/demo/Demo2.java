package demo;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		System.out.println("Enter the age ");
		int a=scn.nextInt();
		if(a>=18){
			System.out.println("valid for marriage");
		}
		else{
			System.out.println("not valid");
		}
	}

}
