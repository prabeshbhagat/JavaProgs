package prctc2018;

public class TestDemo {

	public static void main(String[] args) {
D d1=new D();
d1.c1();
d1.a1();
d1.b1();
	}

}
interface A{
	void a1();
}
interface B{
	void b1();
}
class C{
	void c1(){
		System.out.println("in c1");
	}
}
class D extends C implements A,B{
	public void a1(){
		System.out.println("completing interface A");
	}
	public void b1(){
		System.out.println("completing interface B");
	}
}