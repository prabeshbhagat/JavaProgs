package test;

public class Demo2 {

	public static void main(String[] args) {
E e1=new G();
e1.m1();
F f1=new G();
f1.m1();
f1.m2();
G g2=(G)e1;
g2.m1();
g2.m2();
g2.m3();

	}

}
class E{
	void m1(){
		System.out.println("in m1......");
	}
}
class F extends E{
	void m2(){
		System.out.println("in m2....");
	}
}
class G extends F{
	void m3(){
		System.out.println("in m3....");
	}
	
}