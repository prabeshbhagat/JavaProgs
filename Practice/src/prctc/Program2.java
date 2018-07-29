package prctc;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter 1st no");
		int a=scn.nextInt();
		System.out.println("enter 2d no");
		int b=scn.nextInt();
		if(a>b){
			System.out.println("the greater no is:"+a);}
			else if(b>a){
				System.out.println("the greater no is:" +b);
				
			}
			else{
				System.out.println("the no's are equal");
				
		}
	


	}

}
