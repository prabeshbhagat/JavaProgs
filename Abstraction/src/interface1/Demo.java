package interface1;

public class Demo {

	public static void main(String[] args) {
B b1=new B();
System.out.println(b1.a);
	}

}
interface X{
	int a=10;
}
	
class B implements X{
	int a=15;
}