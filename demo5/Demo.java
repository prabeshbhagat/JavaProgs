package demo5;

public class Demo {
	static void sum(int a,int b){
		System.out.println(a+b);
	}
	static void sum(int a,double b){
		System.out.println(a+b);
	}
public static void main(String[] args) {
	sum(23,45);
	sum(23,4.2);
	
	
}
}