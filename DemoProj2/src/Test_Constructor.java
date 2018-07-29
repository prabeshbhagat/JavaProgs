
public class Test_Constructor {

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile(13,12,15);
		
	}

}


class Mobile{
	
	public Mobile(int l,int b, int h) {
		int area = l*b*h;
		System.out.println("area is : " + area);
	}
	
}