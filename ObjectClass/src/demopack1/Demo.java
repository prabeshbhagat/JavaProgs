package demopack1;

public class Demo {

	public static void main(String[] args) {
Demo1 d=new Demo1("book");
System.out.println(d);

	}
}
class Demo1{
	String title;

 Demo1(String title){
	 this.title=title;
	System.out.println(title);
}
}
