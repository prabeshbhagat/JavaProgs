package demo;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
Scanner scn =new Scanner(System.in);
System.out.println("press a no no 2 know d day");
int a=scn.nextInt();
switch(a){
case 1:System.out.println("monday");
break;
case 2:System.out.println("tueday");
break;

case 3:System.out.println("wedday");
break;

case 4:System.out.println("thuday");
break;

case 5:System.out.println("friay");
break;

case 6:System.out.println("satday");
break;

default:System.out.println("invalid selection");
}

	}

}
