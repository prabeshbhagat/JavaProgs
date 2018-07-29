package prctc2018;

public class TestD {
static void cal(F f1){
	f1.k1();
}
	public static void main(String[] args) {

	cal(new F());
	cal(new J());
	cal(new K());
}
	}




class F{
	void k1(){
		System.out.println("k1 in F");
	}
}

class J extends F{
	void k1(){
		System.out.println("k1 in j");
		
	}
}
class K extends F{
	void k1(){
		System.out.println("k1 in k");
	}
}