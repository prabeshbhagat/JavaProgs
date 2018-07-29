import java.util.Scanner;


public class Tester1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int a = 10;
	
		int b = 2;
		
		try{
			
			System.out.println(a/b);//danger statement
			
		}catch(ArithmeticException e){
			
			System.out.println("executing catch block, number is invalid...");
	
		}finally{
			System.out.println("executing finally mandatorily...");
		}
	
		
		
		System.out.println("some thing...");
		
		
	}

}
