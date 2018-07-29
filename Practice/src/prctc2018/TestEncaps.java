package prctc2018;

public class TestEncaps {

	public static void main(String[] args) {
		DemoA d=new DemoA();
		System.out.println(d.get());

	}

}
class DemoA{
	private int a=50;
	
	public int get(){
		return a;
		
	}
	
	public void set(int i){
		a=i;
	}
	
}
