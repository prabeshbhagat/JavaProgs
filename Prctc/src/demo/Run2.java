package demo;

import java.util.Scanner;

public class Run2 {

	public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	System.out.println("please enter a number");
	int n=scn.nextInt();
int sum=0;
while(n>0){
	sum=sum+(n %10);
	n=n/10;	
	}
System.out.println(sum);
}
	}

