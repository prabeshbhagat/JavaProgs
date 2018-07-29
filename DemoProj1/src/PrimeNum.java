import java.util.Scanner;


public class PrimeNum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
System.out.println("enter a no");
int n=scn.nextInt();
int flag=0;
for(int i=2;i<=n-1;i++)
{
if(n%i==0)
{
	flag=1;
	
}
	}
if(flag==0)
{
	System.out.println("num is prime");
}
else
	System.out.println("not prime");
}
}
