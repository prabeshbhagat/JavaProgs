package Adv1;

public class ConstructorDemo1 {

	public static void main(String[] args) {

		A a1 = new A();
		A a2 = new A();
		A a4 = new A();
		A a3 = new A();
		
		System.out.println(A.count);
		
	}

}

class A{
	
		static int count;
	A(){
		count++;
		System.out.println("this is constructor..");
	}
	
	
	int a;
	public void m1(){
		
	}
	
}