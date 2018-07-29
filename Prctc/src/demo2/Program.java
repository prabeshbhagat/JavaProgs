package demo2;

public class Program {

	public static void main(String[] args) {
Car c=new Benz();
c.run();
Benz b=new Audi();
b.luxury();
b.run();
Audi a1=(Audi)b;
a1.comfort();
a1.luxury();
a1.run();
}

}
class Car{
	void run(){
		System.out.println("car runs");
	}
}
class Benz extends Car{
	void luxury(){
		System.out.println("great luxury");
	}
}
class Audi extends Benz{
	void comfort(){
	System.out.println("great comfort");	
	}
}