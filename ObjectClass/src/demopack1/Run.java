package demopack1;

public class Run {

	public static void main(String[] args) {
Book b=new Book("java",120);
System.out.println(b);
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
		return title+" "+pages;
		
	}
}
