package ex_throw;

public class Run {

	public static void main(String[] args) {
		try{
			m1();
		}catch(InterruptedException e){
			System.out.println("intexcption handled");
		}

	}
static void m1() throws InterruptedException{
	System.out.println("m1 starts");
	Thread.sleep(1000);
	System.out.println("m1 ends");
}
}
