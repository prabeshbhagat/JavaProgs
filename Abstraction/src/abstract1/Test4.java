package abstract1;

public class Test4 {

	public static void main(String[] args) {
		 Bike1 b = new Avenger();  
		  b.run();  
		  b.changeGear();  
		 }

	}


abstract class Bike1{  
	 Bike1()
	  {
		  System.out.println("bike is created");
		   }  
	   abstract void run();  
	   void changeGear()
	   {
		   System.out.println("gear changed");
		   }  
}
	  
	 class Avenger extends Bike1{  
	 void run()
	 {
		 System.out.println("running safely..");
		 }  
	 }  
	 
