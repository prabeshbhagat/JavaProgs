package test;

public class Demo1 {

	public static void main(String[] args) {
Z y1=new Z();
y1.t1();
	}

}
abstract class X{
	abstract   void t1();
}
abstract class Y extends X{
	
	}
class Z extends Y{
	void t1(){
		System.out.println("jjenfj");
	}
}