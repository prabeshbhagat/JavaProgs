package demo5;

import java.util.Scanner;

public class New1 {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("please enetr a string");
String s1=scn.next();
s1=s1.toLowerCase();
int n=s1.length();
for(int i=0;i<n/2;i++){
if((s1.charAt(i))==s1.charAt(n-1-i)){
	System.out.println("pallindrome");
}
else{
	System.out.println("not pallindome");
}
}

	}

}
