package Adv1;

public class Dog {
	 int size;
	   void makeSound()
	{
		if(size<4)
		{
	System.out.println("yep-yep....");
		}
		else if(size>=4 && size<=16)
		{
			System.out.println("bow-bow");
		}
		else if(size>16)
		{
			System.out.println("no sound");
		}
		}
 static class TestDog{
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.size=20;
		d1.makeSound();
		Dog d2=new Dog();
		d2.size=4;
		d2.makeSound();
		
	}
		

	}

}
