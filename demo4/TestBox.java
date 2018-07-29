package demo4;

public class TestBox {

	public static void main(String[] args) {
Box b1=new Box(6,7,8);
Box b2=new Box(9,1,4);
Box b3=new Box(b1);
b1.dimPrint();
b2.dimPrint();
b3.dimPrint();

System.out.println("no of object :"+Box.count);

	}

}
class Box{
	int length;
	int breadth;
	int height;
	static int count=0;
	Box(int length,int breadth,int height){
		this.length=length;
		this.height=height;
		this.breadth=breadth;
		count++;
	}
	
		Box(int b){
		length=breadth=height=b;

	}
		Box(Box c){
			length=c.length;
			height=c.height;
			breadth=c.breadth;
		}
		void dimPrint(){
			System.out.println(+length+""+height+""+breadth);
		}
}