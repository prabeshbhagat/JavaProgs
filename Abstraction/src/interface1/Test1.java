package interface1;

public class Test1 {

	public static void main(String[] args) {
		A1 a1 = new A1();  
		a1.print();  
		a1.show();  
	}

}
interface Printable1{  
void show();  
}  
  
interface Showable{  
void show();  
}  
  
class A1 implements Printable1,Showable{  
  
public void print(){
	System.out.println("Hello");
	}  

public void show(){
	System.out.println("Welcome");
	}  
  
}