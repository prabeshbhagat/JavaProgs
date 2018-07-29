package prctc2018;

public class TestHumanBeing {

	public static void main(String[] args) {
Man t1=new Man();
	t1.m1();
	HumanBeing h1=new Man();
	h1.m1();
	
	Man a1= (Man)h1;
	a1.m1();
	a1.m2();
	
	
	
}
	

}
class HumanBeing{
	void m1(){
	System.out.println("Human");	
	}
	
}

class Man extends HumanBeing{
	void m2(){
		System.out.println("Man");
	}
}