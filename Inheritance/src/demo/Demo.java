package demo;
class A{
	void test1(){
		System.out.println("test1 in A....");
	}
}
class B extends A{
	void test2(){
		System.out.println("test2 in B........");
	}
}
public class Demo {

	public static void main(String[] args) {
       A a1=new A();
       a1.test1();
       B b1=new B();
       b1.test1();
       b1.test2();
	}

}
