package demo;

public class TestInterface implements Book,Copy{
public void m1(){
	System.out.println("multiple inheritance");
}

	public static void main(String[] args) {
TestInterface t=new TestInterface();
	t.m1();
}
	}




interface Book{
	void m1();
}

interface Copy{
	void m1();
}