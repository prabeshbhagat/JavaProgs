package test;

public class Qt {

	public static void main(String[] args) {
new Q();
new R(56);
	}

}
class Q {
Q(){
	System.out.println("bla bla");
}
Q(int a){
	System.out.println("tataaa");
	
}}
class R extends Q{
	R(){
		super();
	System.out.println("in r no args");	
	}
	R(double d){
		super(35);
		System.out.println("in args ctt");
	}

}

