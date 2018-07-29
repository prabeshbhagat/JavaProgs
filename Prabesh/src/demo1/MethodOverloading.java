package demo1;

public class MethodOverloading {
static void m1(int a,int b){
	System.out.println(a+b);
}
static void m1(double a,int b){
	System.out.println(a+b);
}
static void m1(int a,int b,int c){
	System.out.println(a+b+c);
}
	public static void main(String[] args) {
m1(2,3);
m1(2.4,3);
m1(2,3,4);


	}

}
