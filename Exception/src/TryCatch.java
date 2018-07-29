import java.util.Scanner;


public class TryCatch {

	public static void main(String[] args) {
     System.out.println("main starts");
     Scanner scn=new Scanner (System.in);
     int i=10;
     System.out.println("enter the no ");
     int j=scn.nextInt();
     int k;
     try{
    	 k=i/j;
    	 System.out.println(k);
     }
    catch(ArithmeticException e){
    	k=i/2;
    	System.out.println(k);
    }
	}

}
