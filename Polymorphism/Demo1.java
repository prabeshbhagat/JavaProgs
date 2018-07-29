package com.ojm18.Polymorphism;

public class Demo1 {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c = new Audi();
		c.start();
		c= new Benz();
		c.start();

	}

}
class Car{
	void start(){
		System.out.println("only car..");
	}
}
class Audi extends Car{
	void start(){
		System.out.println("audi here..");
	}
}
class Benz extends Car{
	void start(){
		System.out.println("benz here..");
	}
}