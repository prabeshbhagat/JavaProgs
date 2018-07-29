package demo5;

public class Program2 {

	public static void main(String[] args) {
test1();
	}


static void test1(){
	System.out.println("test1 starts");
	try{
		test2();
	}
	catch(ArithmeticException e){
		System.out.println("exception handled");
	}}
	static void test2(){
	int i=10/0;
	System.out.println(i);
	}
}
