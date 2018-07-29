package trycatch;

public class Demo {

	public static void main(String[] args) {
int a=30;
int b=0;
try{
	

int c=a/b;
System.out.println(c);

	}catch(ArithmeticException e){
		System.out.println(e);
	}

}
}