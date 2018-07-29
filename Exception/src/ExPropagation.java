
public class ExPropagation {

	public static void main(String[] args) {
		System.out.println("main starts");
		test1();
		System.out.println("main ends");
		

	}


static void test1(){
	System.out.println("test1 starts");
	try{
		test2();
	}
	catch(ArithmeticException e){
		System.out.println("executing catch in test1");
	}
	System.out.println("test1 ends");
	}
static void test2(){
	System.out.println("test2 starts");
	int i=10/0;
	System.out.println(i);
	System.out.println("test2 ends");
}
}