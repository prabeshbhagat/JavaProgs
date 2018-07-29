package prctc2018;

public class TestAbstrct {

	public static void main(String[] args) {
H h1=new H();
h1.m1();
h1.n1();
	}

}


abstract class G{
	abstract void m1();
	abstract void n1();
	public void p1(){
		System.out.println("in method p1.....");
	}
}
class H extends G{
	public void m1(){
		System.out.println("in method m1....");
	}
	public void n1(){
		System.out.println("in method n1...");
	}
}