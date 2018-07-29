package test;

public class Owner {

	public static void main(String[] args) {
Car c1=new Car(20);
Car c2=new Car(40);
Driver d=new Driver();
d.drive(c1);
d.drive(c2);

	}

}
class Car{
	int no;
	Car(int no){
		this.no=no;
	}
	void start(){
		System.out.println(no+"car starts");
	}
	void move(){
		System.out.println(no+"car moves");
	}
	void stop(){
		System.out.println(no+"car stops");
	
	}
}
class Driver{
	void drive(Car c){
	c.start();
	c.move();
	c.stop();
	}
}
