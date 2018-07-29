package demo;

	class X{
		void m1(){
			System.out.println("m1 in x.....");
		}
	}
	class Y extends X{
		void m1(int a){
			System.out.println("m1 in y.....");
		}
		void m2(){
			System.out.println("m2 in y");
		}
	}
	class Z extends Y{
		void m1(int a){
			System.out.println("m1 in z");
		}
		
	}
	public class OverridingEx {

	public static void main(String[] args) {
X a1=new X();
Y y1=new Y();
y1.m1(3);
y1.m1();
y1.m2();
	}

}
