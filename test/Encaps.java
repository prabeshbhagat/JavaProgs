package test;

public class Encaps {

	public static void main(String[] args) {
Programmer p=new Programmer();
p.set(20);
System.out.println(p.get());
	}

}
class Programmer{
	private int i;
	public void set (int j){
		i=j;
	}
	
	public int get(){
		return i;
	}
}