package demo;

public class MethodOverload {

 static void test(int a,int b,int c){
	 System.out.println(a+b+c);
 }
	 static void test(double a,int b,int c){
		 System.out.println(a+b+c);
	 }
		 static void test(int a,double b,int c){
			 System.out.println(a+b+c);
		 }
			 static void test(double a,double b ,int c){
				 System.out.println(a+b+c);

	 
 }
	


public static void main(String[] args) {
	test(2,3,4);
	test(2.3,3,4);
	test(2,3.2,4);
	test(2.1,3.2,5);
}
}
