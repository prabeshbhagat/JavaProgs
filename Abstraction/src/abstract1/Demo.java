package abstract1;
abstract class D{
	void test1(){
		System.out.println("test1 in D......");
	}
	abstract void test2();
}
class E extends D{
	void test2(){
		System.out.println("in abstract test2....");
	}
}
public class Demo {

	public static void main(String[] args) {
E b1=new E();
b1.test1();
b1.test2();
	}

}
