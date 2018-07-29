package test;

public class Type4 {
static void cal(M m1){
	m1.a();
}
	public static void main(String[] args) {
cal(new M());
cal(new N());

	}

}
class M{
	 void a(){
		System.out.println(" a in m");
	}
}
class N extends M{
	 void a(){
		System.out.println("a In n");
	}
}