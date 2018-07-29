package com;

public class Tester1 {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		a1.move();
	//	a1.bark();
		
		Dog d1 = (Dog) a1;//downcasting
		d1.bark();
	}

}

class Animal{
	void move(){
		System.out.println("animal moving...");
	}
}
class Dog extends Animal{
	void move(){
		System.out.println("dog moving..");
	}
	void bark(){
		System.out.println("dog barking...");
	}
}

