package prctc;

import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter ur name");
		String un=scn.next();
		System.out.println("enter ur age");
		int age=scn.nextInt();
		System.out.println("ur name and age is:"+un+""+age);

	}

}
