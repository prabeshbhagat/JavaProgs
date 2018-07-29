package Adv1;

public class ConstructorDemo2 {

	public static void main(String[] args) {
		A1 aa = new A1();
		A1 a1 = new A1(5);
		A1 a2 = new A1(2,3);
		
	}
	
}

class A1 {
	
	A1(){
		System.out.println("no args ctt..");
	}
	
	A1(int a){
		System.out.println("single ctt..");
	}
	
	A1(int a,int b){
		System.out.println("double ctt...");
	}
	
	A1(String s){
		System.out.println("string ctt..");
	}
	
}