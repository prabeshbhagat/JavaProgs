package test;

public class Run2 {

	public static void main(String[] args) {
Book b=new Book("java",200);
Book b2=new Book("jaa",200);
System.out.println(b.equals(b2));

	}

}
class Book{
	String bname;
	int pages;
	Book(String bname,int pages){
		this.bname=bname;
		this.pages=pages;
		
	}
	public String toString(){
		return "["+bname+","+pages+"]";
	}
	public boolean equals (Object x){
		Book b1=(Book)x;
		return this.bname.equals(b1.bname) && this.pages==b1.pages;
}
}