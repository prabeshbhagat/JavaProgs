
public class Test4 {

	public static void main(String[] args) {
		m1(5);
		String result = add(5,7);
		System.out.println(result);
	}
	
	public static void m1(int a){
		System.out.println(a);
	}
	
	public static String add(int a, int b){
		System.out.println("adding the numbers...");
		return "" +(a+b);
	}
	
}
