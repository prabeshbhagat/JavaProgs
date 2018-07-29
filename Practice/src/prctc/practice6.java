package prctc;

import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("press any no between 1-7");
		int n =scn.nextInt();
		switch(n){
		case 1:System.out.println("Mon");
		break;
		case 2:System.out.println("tue");
		break;
		case 3:System.out.println("wed");
		break;
		case 4:System.out.println("thu");
		break;
		default:System.out.println("sorry day not found");



		}
		

	}

}
