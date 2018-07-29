package abstract1;

public class Test3 {

	public static void main(String[] args) {
PlanTravel t2=new TravelAgent1();
t2.bangtoCh();
t2.chtoMumbai();
t2.mumbaitoDel();
	}

}
abstract class PlanTravel{
	abstract void bangtoCh();
	abstract void chtoMumbai();
	abstract void mumbaitoDel();
}
class TravelAgent1 extends PlanTravel{
	 void bangtoCh(){
		 System.out.println(" via train");
		 
	 }
	  void chtoMumbai(){
		  System.out.println(" via flight");
		  
	  }
	void mumbaitoDel(){
		System.out.println(" via bus");
		
	}
}
class TravelAgent2 extends PlanTravel{
	 void bangtoCh(){
		System.out.println("via cab"); 
	 }
	 void chtoMumbai(){
		 System.out.println("via train");
		 
	 }
	 void mumbaitoDel(){
		 System.out.println("via flight");
	 }
	 }