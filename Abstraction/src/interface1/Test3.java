package interface1;

public class Test3 {

	public static void main(String[] args) {
		//Printable3 t = new Testinterface();  
		//t.print(); 
		Testinterface t = new Testinterface();  
         t.print();
		t.show();  
	}

}
interface Printable3{  
void print();  
}  
interface Showable3 extends Printable3{  
void show();  
}  
class Testinterface implements Showable3{  
  
public void print(){
	System.out.println("Hello");
	}  

public void show(){
	System.out.println("Welcome");}  
}
  
