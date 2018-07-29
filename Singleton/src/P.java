
public class P {
	private static P p1=null;
	private P(){
		System.out.println("in p ctt");
	}
public void test(){
	System.out.println("welcome");
}
static P getInstance(){
	if(p1==null){
		p1=new P();
		}
		return p1;
		
		
			
		}

	
	
	
}

