package prctc2018;

public class TestTree {

	public static void main(String[] args) {
Tree t1=new Tree(26);
System.out.println(t1);
Tree t2=new Tree(26);
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
		return height+ " ";
	}
	public boolean equals(Object x){
		return this.height==((Tree)x).height;
	}}
