package demo5;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

	
	
Scanner scn =new Scanner(System.in);
System.out.println("pleaser enter a no");
int a=scn.nextInt();
System.out.println("please enter a no to divide");
int b=scn.nextInt();
try{
	int c=a/b;
	System.out.println(c);
}catch(ArithmeticException e){
	System.out.println("exception handled");
}

}
}