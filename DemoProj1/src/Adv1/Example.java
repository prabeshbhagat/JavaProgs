package Adv1;

public class Example {
	static int p = 49;
	void t2()
	{
		System.out.println(p);
	}

	public static void main(String[] args) {
		System.out.println("pgm starts");
		Example e1=new Example();
		Example e2=new Example();

		e1.t2();
		e2.t2();
		System.out.println("pgm ends");
		

	}

}
