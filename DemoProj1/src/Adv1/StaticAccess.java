package Adv1;

public class StaticAccess {

	 static double d=5.6;
	 static void test1()
	{
	System.out.println("in test1()....... ");	
	}
	 public static void main(String[] args)
	 {
	 
	
		System.out.println(d);
		test1();

	}

{
	System.out.println(d);
	test1();
	System.out.println(StaticAccess.d);
	StaticAccess.test1();
	
}
}

