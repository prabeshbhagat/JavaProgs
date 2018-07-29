package test;

public class Type5 {
static void cal(Animal a1){
	a1.bark();
}
	public static void main(String[] args) {
cal(new Dog());
cal (new Goat());
	}

}
interface Animal{
	void bark();
}
class Dog implements Animal{
	public void bark(){
		System.out.println("Dog walks");
	}
}
class Goat implements Animal{
	public void bark(){
		System.out.println("goat barks");
	}
}