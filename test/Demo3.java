package test;

public class Demo3 {

	public static void main(String[] args) {
Ram h1=new Ram();
h1.see();
h1.walk();
	}

}
interface Humanbeing{
	void walk();
	void see();
}
class Ram implements Humanbeing{
 public void walk(){
	System.out.println("can walk");  
  }
 public void see(){
	 System.out.println("can see");
 }
}