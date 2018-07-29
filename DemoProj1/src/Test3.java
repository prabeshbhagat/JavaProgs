
public class Test3 {

	public static void main(String[] args) {
		int i = m1();
		System.out.println("the returned value is : "+ m1());
		System.out.println("the  value of i  is : "+ i);
		double d = m2();
		System.out.println(d);
		String s = m3();
		System.out.println(s);
		char c = m4();
		System.out.println(c);
		
	}
	
	public static int m1(){
		int i = 10;
		int j = 12;
		return i+j;
		
	}
	public static double m2(){
		return 10.12;
	}
	public static String m3(){
		String s = "heloo...";
		return s;
	} 
	public static char m4(){
		char a = 'x';
		
		System.out.println("sdbshd");
		return a;
	}
	
}
