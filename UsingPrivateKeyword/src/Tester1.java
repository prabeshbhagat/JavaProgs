
public class Tester1 {

	public static void main(String[] args) {
		B b1 = new B();
		b1.m3();
	}

}

class A{
	private int a=5;
	int b=3;
	
	private void m1(){
		System.out.println("m1 method");
	}
	void m2(){
		m1();
		System.out.println(a);
		System.out.println("m2 method");
	}
}

class B extends A{
	
	void m3(){
		// System.out.println(a);
		System.out.println(b);
		// m1();
		m2();
	}
	
}