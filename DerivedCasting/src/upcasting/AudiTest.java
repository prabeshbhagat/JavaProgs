package upcasting;
class Car{
	void drive(){
		
		
	}
}
class Audi extends Car{
	void drive(){
		System.out.println("Audi is driven");
	}
	void black(){
	System.out.println("audi is black");
}
}
class Benz extends Audi{
	void drive(){
		System.out.println("Benz is driven");
	}
	void white(){
		System.out.println("BENZ IS WHITE");
	}
}


public class AudiTest {

	public static void main(String[] args) {
	
Audi b=new Benz();
b.drive();
b.black();

Car a=new Audi();
a.drive();


	
}
	}

