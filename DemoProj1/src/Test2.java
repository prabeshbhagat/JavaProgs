
public abstract class Test2 {

	public static void main(String[] args) {
		System.out.println("MAIN METHOD STARTS...");
		m1();
		System.out.println("MAIN METHOD ENDS...");
	}
	public static void m1(){
		System.out.println("M1. STARTS..");
		m2();
		System.out.println("m1 ends...");
	} 
	
	public static void m2(){
		System.out.println("M2. STARTS..");
		System.out.println("m2 ends...");
	}
}
