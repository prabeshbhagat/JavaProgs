package demo4;

public class Test1 {

	public static void main(String[] args) {
Y y1=new Y();
System.out.println(y1.get());
}
	}


class X{
	private int i=10;

public int get(){
	return i;
}
}
class Y extends X{
	
}