package demopack1;

public class Flower {
	String fname;
	String fcolor;
	Flower(String fname,String fcolor){
		this.fname=fname;
		this.fcolor=fcolor;
	}
	public String toString(){
		return fname+" "+fcolor;
	}
	public static void main(String[] args) {
Flower f1=new Flower("rose", "red");
Flower f2=new Flower("marigold","yellow");
System.out.println(f1);
System.out.println(f2);
}
}