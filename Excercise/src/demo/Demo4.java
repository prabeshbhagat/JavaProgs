package demo;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the no to know factorial");
		int n=scn.nextInt();
		int product=1;
		for(int i=n;i>=1;i--){
			product=product*i;
			
			System.out.println(product);
		}

	}

}
