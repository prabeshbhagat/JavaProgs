package demo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the 1st no");
		int a=scn.nextInt();
		System.out.println("Enter the 2nd no");
		int b=scn.nextInt();
		if(a>b){
			System.out.println("the greater no is:"+a);
		}
		else if(b>a){
			System.out.println("the greater no is:"+b);
		}
		else{
			System.out.println("Equal");
		}

	}

}
