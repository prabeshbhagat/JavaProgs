package demo4;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("enter an alphabet sring");
String s1=scn.next();
char c;
for(int i=0;i<=s1.length()-1;i++){
	c=s1.charAt(i);
	if(c>=48 && c<=57){
		System.out.println(c);
	}
}
}

}
