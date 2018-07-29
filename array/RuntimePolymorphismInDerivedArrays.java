package com.ojm18.array;

public class RuntimePolymorphismInDerivedArrays {

	public static void main(String[] args) {
		
		Animal [] anml = {new Dog(), new Cat(), new Tiger()};
		
		for (Animal arr : anml){
			arr.makeSound();//runtime polumorphism
		}
	}
}

interface Animal{
	void makeSound();
}

class Dog implements Animal{
	public void makeSound(){
		System.out.println("bho bho");
	}
}

class Cat implements Animal{
	public void makeSound(){
		System.out.println("meaw meaw");
	}
}

class Tiger implements Animal{
	public void makeSound(){
		System.out.println("hewh hewh");
	}
}