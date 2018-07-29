package interface1;

public class TestBike {

	public static void main(String[] args) {
Bike e=new Ktm();
e.engine();
e.bike();
e.cc();
	}

}
interface Engine{
	void engine();
		
}
interface Cc extends Engine{
	void cc();
}
interface Bike extends Cc{
	void bike();
}
class Ktm implements Bike{
	public void engine(){
		System.out.println("kassa engine");
	}
	public void cc(){
		System.out.println("150 cc");
	}
	public void bike(){
		System.out.println("nangha bike");
	}
}