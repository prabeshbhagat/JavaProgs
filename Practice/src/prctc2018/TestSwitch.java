package prctc2018;

public class TestSwitch {

	public static void main(String[] args) {
CflBulb cf=new CflBulb();
cf.off();
cf.on();
	}

}


interface Switch{
	void on();
	void off();
}

class CflBulb implements Switch{
	public void on(){
		System.out.println("CFL switched on");
	}
	public void off(){
		System.out.println("CFL is switched off");
	}
}