package test;

public class Demo {

	public static void main(String[] args) {
Human h1=new Human();
h1.walk();
	}

}
class Human{
	void walk(){
		System.out.println("Human can walk");
	}
}
class Man extends Human{
	void walk(){
	System.out.println("man can walk");	
	}
}