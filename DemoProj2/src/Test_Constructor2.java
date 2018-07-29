
public class Test_Constructor2 {

	public static void main(String[] args) {
		Test1w t1 = new Test1w();
		Test1w t2 = new Test1w(5);
		Test1w t3 = new Test1w(23,"string value..");
	}

}

class Test1w{
	
	Test1w(){
		System.out.println("object created with no arg...");
	}
	
	Test1w(int a){
		System.out.println("object created with an int value : "+a);
	}
	
	
	Test1w(int a, String s){
		System.out.println("object created with values : "+a+" & "+s);
	}
}