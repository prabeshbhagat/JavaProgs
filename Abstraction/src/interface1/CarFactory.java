package interface1;

import java.util.Scanner;

public class CarFactory {

	
static Car getCAr(){
	Scanner scn=new Scanner(System.in);
	System.out.println("enter acar type");
	String carType=scn.next();
	Car c=null;
	if(carType.equals("bmw")){
		c=new Bmw();
	}
	if(carType.equals("Audi")){
		c=new Audi();
	}
	return c;
}
	}

class Drive{
	public static void main(String[] args) {
		Car c=CarFactory.getCAr();
	}
}
interface Car{
	void start();
	void move();
	void stop();
}
class Bmw implements Car{
	public void start(){
		System.out.println("Bmw starts.....");
	}
	public void move(){
		System.out.println("Bmw starts.....");
	}
	public void stop(){
		System.out.println("Bmw stops.....");
	}
	
}
class Audi implements Car{
	public void start(){
		System.out.println("Audi starts.....");
	}
	public void move(){
		System.out.println("Audi starts.....");
	}
	public void stop(){
		System.out.println("Bmw stops.....");}}