package demo4;

public class Test {

	public static void main(String[] args) {
A a1=new A();
a1.m1();
B b1=new B();
b1.m1();
b1.m2();
C c1=new C();
c1.m1();
c1.m2();
c1.m3();
	}

}
class A{
	void m1(){
		System.out.println("m1 in a");
	}
}
class B extends A{
	void m2(){
		System.out.println("m2 in b");
	}
}
class C extends B{
	void m3(){
		System.out.println("m3 in c");
	}
}