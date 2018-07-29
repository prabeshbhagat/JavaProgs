package equals;

public class Test {

	public static void main(String[] args) {
Tree t1=new Tree(10);
System.out.println(t1);
Tree t2=new Tree(11);
System.out.println(t2);
System.out.println(t1==t2);
System.out.println(t1.equals(t2));
	}

}
class Tree{
	int height;
	Tree(int height){
		this.height=height;
	}
	public String toString(){
		return height+"";
	}

public boolean equals(Object a){
	return this.height==((Tree)a).height;
}



}