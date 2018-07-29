package prctc;

public class TestBook {

	public static void main(String[] args) {
Book b1=new Book(20,"jaba");
System.out.println(b1);
Book b2=new Book(40,"kvb");
System.out.println(b1.equals(b2));
	}

}
class Book{
	int pages;
	String name;
	Book(int pages,String name){
		this.pages=pages;
		this.name=name;
	}
	public String toString(){
		return "["+name+","+pages+"]";
	}
	public boolean equals (Object x){
		Book b=(Book)x;
		return this.pages==b.pages;
	}
}