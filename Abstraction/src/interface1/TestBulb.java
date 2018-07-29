package interface1;

public class TestBulb {

	public static void main(String[] args) {
		Switch s=new CflBulb();
		s.on();
		s.off();

	}

}
interface Switch{
	void on();
	void off();
}
class CflBulb implements Switch{
	public void on(){
		System.out.println("cfl is on...");
	}
	public void off(){
		System.out.println("cfl is off");
		
	}
}
