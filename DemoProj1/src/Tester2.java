
public class Tester2 {
	
	
	public static void main(String[] args) {
				
		A a = new B();
		
		try {
			C c = (C) a;
		} catch (ClassCastException e) {
			System.out.println("invalid instance...");
		}
		
		
		
	}

}

class A{
	
	public void m1(){
		System.out.println("method m1...");
	}
	
}

class B extends A{
	
	public void m1(){
		System.out.println("method m1...");
	}
	
}

class C extends A{
	public void m1(){
		System.out.println("method m1...");
	}
}