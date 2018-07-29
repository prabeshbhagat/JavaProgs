package test;

public class Pro {
Pro(){
	System.out.println("in no args ctt");
}
Pro(int a){
	this();
	System.out.println("in parametrised ctt");
}
Pro(String a){
	this(20);

	System.out.println("in  ctt");
}
	public static void main(String[] args) {
Pro p=new Pro();
Pro p1=new Pro(20);
Pro p2=new Pro("jj");


	}

}
