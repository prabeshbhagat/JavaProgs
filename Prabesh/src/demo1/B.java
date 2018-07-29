package demo1;

public class B {
B(){
	System.out.println("default ctt");
}
B(int i){
	System.out.println("parametrized ctt");
}
B(double j){
	this(5);
	System.out.println("hghghb");
}
}
