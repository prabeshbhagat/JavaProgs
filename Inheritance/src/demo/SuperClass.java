package demo;
class E{
	E(){
		System.out.println("in E ctt");
	}
}
class F extends E{
	F(){
		//super();
		System.out.println("in F ctt");
	}
}
class G extends F{
	G(){
		//super();
		System.out.println("in g ctt");
	}
}
public class SuperClass {

	public static void main(String[] args) {
		G g1=new G();

	}

}
