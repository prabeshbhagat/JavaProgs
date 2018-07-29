package demo2;

public class Test2 {
	public static void main(String[] args) {

Bike b=new Hero();
b.start();	
b=new Ninja();
b.start();}

}
interface Bike{
	void start();
}
class Hero implements Bike{
	public void start(){
	System.out.println("kick start");	
	}
}
class Ninja implements Bike{
	public void start(){
		System.out.println("Self start");	
		}

}