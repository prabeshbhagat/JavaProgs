package demo5;

import java.util.Arrays;

public class Run {

	public static void main(String[] args) {
Book[]b1=new Book[3];
b1[0]=new Book("zaba",299);
b1[1]=new Book("kaba",243);
b1[2]=new Book("baba",888);
Arrays.sort(b1);
System.out.println("printing");
for(Book b:b1){
	System.out.println(b);
}


	}

}
class Book implements Comparable{
	String title;
	int pages;
	Book(String title,int pages){
		this.title=title;
		this.pages=pages;
		
	}
	public String toString(){
		return "["+title+", "+pages+"]";
	}
	public int compareTo(Object x){
		Book b=(Book)x;
		return title.compareTo(b.title);
	}
}