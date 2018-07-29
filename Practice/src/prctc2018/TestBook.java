package prctc2018;

public class TestBook {

	public static void main(String[] args) {
Book b1=new Book("tallman",400);
System.out.println(b1);
	}

}


class Book{
	String title;
	int pages;
	Book(String title,int pages){
		this.title=title;
		this.pages=pages;
	}
	
	public String toString(){
		return "["+title+","+pages+"]";
	}
}