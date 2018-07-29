package demo;

public class Test {
static double d=5.6;
		static void test1(){
			System.out.println("in test1......");
		}
		public static void main(String[] args) {
			double d=3.2;
			Test t=new Test();
			System.out.println(t.d);
			test1();
		System.out.println(d);

	}

}
