package demo6;

public class Pro {
static void drive(Bike b1){
	b1.start();
	b1.stop();
}
	public static void main(String[] args) {
drive(new Bajaj());
drive(new Suzuki());
	}

}
interface Bike{
	void start();
	void stop();
}
class Bajaj implements Bike{
public	void start(){
	System.out.println("self start");	
	}
public void stop(){
	System.out.println("bajaj stops");
}
}
class Suzuki implements Bike{
	public void start(){
		System.out.println("kick start");
	}
	public void stop(){
		System.out.println("suzuki stops");
	}
}