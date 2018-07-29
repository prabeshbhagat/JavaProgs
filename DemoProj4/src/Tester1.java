
public class Tester1 {

	public static void main(String[] args) {
		
		B B1= new B("m",23);
		
	}

}

class A{
	
	public A(int a) {
		System.out.println("ctt in A");
	}
	
}

class B extends A{
	
	public B(String s, int a) {
		super(56);
		System.out.println("ctt in B..");
	}
	
}

class  C extends B{
	public C() {
		super("kjhfjsd", 657);
		System.out.println("ctt in C");
	}
}