package prctc2018;

public class TestDownCasting {

	public static void main(String[] args) {
Animal a1=new Dog();
a1.walk();

Dog d1=(Dog)a1;
d1.hear();
d1.walk();
	}

}


class Animal{
	void walk(){
		System.out.println("Animal can walk");
	}
	
}

class Dog extends Animal{
	void walk(){
		System.out.println("Dog can walk");
	}
	
	void hear(){
		System.out.println("Dog can hear");
	}
}
