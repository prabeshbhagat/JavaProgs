package Adv1;

public class Demo2 {
	int k=50;
	void t1()
	{
		System.out.println("in t1");
	}
	static void t2()
	{
		Demo2 d2=new Demo2();
		System.out.println(d2.k);
		d2.t1();
	}
	static void t3()
	{
		Demo2 d3=new Demo2();
		System.out.println(d3.k);
		d3.t1();
	}
		

	public static void main(String[] args) {
		System.out.println("pgm starts");
		t2();
		Demo2.t3();
		System.out.println("pgm ends");
		

	}

}
