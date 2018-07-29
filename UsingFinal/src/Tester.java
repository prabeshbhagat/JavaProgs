
public class Tester {
	
	
	
	public static void main(String[] args) {
		
	}

}

class A{
	
	int a = 5;
	final int b = 10;
	void m1(){
		a = 10;//reasigning 
		
	//	b = 12;//error
	}
}

class B{
	static final int a = 7;
	static void m1(){
	//	a = 12;
	}
}