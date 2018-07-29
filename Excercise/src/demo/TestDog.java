package demo;

public class TestDog {

	public static void main(String[] args) {
Dog d1=new Dog("bnk");
System.out.println(d1.name);
Dog d2=new Dog("aka");
System.out.println(d2.name);
System.out.println("no of object created:"+Dog.count);
Dog d=new Dog();


	}

}
