
public class Tester2 {

	public static void main(String[] args) {
		B1 b1 = new B1();
		b1.m1();
		A1 a1 = new A1();
		a1.m1();
	}

}

class A1{
	void m1(){
		System.out.println("method in A");
	}
}

class B1 extends A1{
	
	void m1() {
		System.out.println("method in B");
		System.out.println("hi   ..");
	}
	
	void m1(int b){
		
	}
}