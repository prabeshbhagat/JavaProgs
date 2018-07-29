package demo6;

public class Test1 {

	public static void main(String[] args) {
E e1=new E();


	}

}
class D{
	D(){
		System.out.println("in d no args ctt");
	}
	D(int i){
		this();
		System.out.println("int d arg ctt ");
	}
}
class E extends D{
	E(){
	super();
	System.out.println("in e ctt");
	}
}