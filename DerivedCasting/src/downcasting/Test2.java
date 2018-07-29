package downcasting;


public class Test2 {

	public static void main(String[] args) {
		Human h1=new Man();
		h1.behavior();
		Man m1=(Man)h1;
		m1.behavior();
		m1.work();
		WoMan w1=(WoMan) h1;
         w1.behavior();
         w1.cook();
        w1.work();
		Human h2=new WoMan();
		WoMan w2=(WoMan)h2;
		w2.behavior();
		w2.work();
		w2.cook();
		Man m2=new WoMan();
		WoMan w3=(WoMan)m2;
		w3.behavior();
		w3.cook();
		w3.work();
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
