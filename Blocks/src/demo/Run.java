package demo;
class E{
	static{
		System.out.println("in static block");
	}
	{
		System.out.println("in non static block");
	}
	E(){
		System.out.println("no args ctt");
	}
}
public class Run {

	public static void main(String[] args) {
E e1=new E();
E e2=new E();
	}

}
