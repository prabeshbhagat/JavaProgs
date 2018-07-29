package trycatch;

public class Demo2 {

	public static void main(String[] args) {
test3();
	}


static void test1(){
	int a=50/0;
	
}
static void test2(){
	test1();
}
static void test3(){
	try{
		test2();
	}
	catch(ArithmeticException e){
		System.out.println("exception handled");
	}
}
}