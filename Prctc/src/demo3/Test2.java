package demo3;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
java.util.Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int flag=0;
for(int i=2;i<=n-1;i++){
	if(n%i==0){
		flag=1;
	}
}
if (flag==0){
	System.out.println("num is prime");
}
else{
	System.out.println("num is not prime");
}
	}

}
