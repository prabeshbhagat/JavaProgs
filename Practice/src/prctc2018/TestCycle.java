package prctc2018;

public class TestCycle {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.start();
		SuperCar sc=new SuperCar();
		sc.start();
		sc.engineStart();

	}

}
interface Cycle{
	void start();
}
interface MotorCycle extends Cycle{
	void engineStart();
}
class Car implements Cycle{
	public void start(){
		System.out.println("car starts");
	}
}
class SuperCar implements MotorCycle{
	public void start(){
		System.out.println("super car starts");
	}
	public void engineStart(){
		System.out.println("super car engine starts");
	}
}