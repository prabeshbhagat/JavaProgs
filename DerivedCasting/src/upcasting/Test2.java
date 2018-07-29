package upcasting;

public class Test2 {

	public static void main(String[] args) {
		Human h1=new Man();
		h1.behavior();
		Man m=new WoMan();
		m.behavior();
		m.work();
	}

}


class Human{
	void behavior(){
		System.out.println("can walk,run,dance...");
	}
	
}
class Man extends Human{
	void work(){
		System.out.println("goes to office and work");
	}
}
class WoMan extends Man{
	void cook(){
		System.out.println("cook food");
	}
}