package demo;
class C{
	private int i=10;
	public int get(){
		return i;
	}
}
class D extends C{
	 void see(){
		 
		System.out.println("in d....");
	}
}

public class PrivateKey {

	public static void main(String[] args) {
D d1=new D();
System.out.println(d1.get());
	}

}
