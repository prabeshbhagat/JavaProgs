package abstract1;

public abstract class Test2 {

	public static void main(String[] args) {
A2 a2=new A2();
a2.wish8();
a2.wish9();
		
	}

}
abstract class A{
	abstract void wish8();
	abstract void wish9();
}
abstract class A1 extends A{
	void wish8(){
		System.out.println("its raining");
	}
}
class A2 extends A1{
	void wish9(){
		System.out.println("its cold");
	}
}