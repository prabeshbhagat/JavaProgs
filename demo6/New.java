package demo6;

public class New {
static void cal(A a1){
	a1.m1();
}
	public static void main(String[] args) {
cal(new A());
cal(new B());
cal(new C());
	}

}
class A{
	void m1(){
	System.out.println("m1 in a");
	}
}
class B extends A{
	void m1(){
		System.out.println("m1 in b");
	}
}
class C extends A{
	void m1(){
		System.out.println("m1 in c");
	}
}