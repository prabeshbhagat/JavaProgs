package demo5;

public class Program3 {

	public static void main(String[] args) {
Tree t1=new Tree(50,"patas");
Tree t2=new Tree(50,"Patas");
System.out.println(t1.equals(t2));
	}

}
class Tree{
	int height;
	String tname;
	Tree(int height,String tname){
		this.height=height;
		this.tname=tname;
	}
	public String toString(){
		return "["+height+" "+tname+"]";
	}
	public boolean equals (Object x){
		Tree t=(Tree)x;
		return this.height==t.height&&this.tname.equalsIgnoreCase(t.tname);
	}
}