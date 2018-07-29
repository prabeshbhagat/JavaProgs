package equals;

public class Run {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle(20,40);
		Rectangle r2=new Rectangle(20,40);
		Rectangle r3=new Rectangle(20,40);
		System.out.println(r1.equals(r2));
		System.out.println(r2.equals(r3));
System.out.println(r1.toString());
	}

}
class Rectangle{
	int length;
	int breadth;
	Rectangle(int l,int b){
		length=l;
		breadth=b;
	}

public String toString(){
	return length+", "+breadth;
}
public boolean equals (Object x){
	Rectangle rec=(Rectangle)x;
	return length==rec.length && breadth==rec.breadth;
}
}