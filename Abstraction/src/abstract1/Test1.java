package abstract1;

public class Test1 {

	public static void main(String[] args) {
		Bike b = new Honda();
		//Bike b=new Hero();
		b.run();
Honda h=new Honda();
h.run();
	}

}
abstract class Bike{
	abstract void run();
}
class Honda extends Bike{
	void run(){
		System.out.println("running safely& good mileage");
	}
}
class Hero extends Bike{
	void run(){
		System.out.println("running safely & best mileage");
	}
}