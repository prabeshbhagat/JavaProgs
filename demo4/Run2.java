package demo4;
public class Run2 {

	public static void main(String[] args) {
Book b1=new Book(800,300);
Book b2=new Book(800,301);
System.out.println(b1.equals(b2));
	}

}
class Book{
	int title;
	int pages;
	Book(int title,int pages){
		this.title=title;
		this.pages=pages;
	}
	public String toString(){
		
    return ""+title+","+pages+"";

	}
	public boolean equals (Object o){
		return this.pages==((Book)o).pages && this.title==((Book)o).title;
	}
}