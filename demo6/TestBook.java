package demo6;

import java.util.Arrays;

public class TestBook {

	public static void main(String[] args) {
Book[]b=new Book[4];
b[0]=new Book("java",400);
b[1]=new Book("lava",600);
b[2]=new Book("kava",200);
b[3]=new Book("bava",300);
Arrays.sort(b);
for(Book k:b){
	System.out.println(k);
}
	}

}
class Book implements Comparable{
	String name;
	int pages;
	Book(String name,int pages){
	this.name=name;
	this.pages=pages;
	}
	public String toString(){
		return "["+name+","+pages+"]";
	}
	public int compareTo(Object x1){
		Book b=(Book)x1;
		return this.pages-b.pages;
	}
}