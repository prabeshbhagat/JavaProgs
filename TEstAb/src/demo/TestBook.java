package demo;

import java.util.Arrays;
import java.util.Comparator;

public class TestBook {

	public static void main(String[] args) {
Book[]b=new Book[4];
b[0]=new Book("java",400);
b[1]=new Book("hghgh",876);
b[2]=new Book("kava",300);
b[3]=new Book("lava",98700);
System.out.println("sorting by page");
Arrays.sort(b,new PageSorter());
for(Book k:b){
	System.out.println(k);
}
System.out.println("sorting by name");
Arrays.sort(b,new NameSorter());
for(Book k:b){
	System.out.println(k);
	}

}}
class Book{
	int pages;
	String name;
	Book(String name,int pages){
		this.pages=pages;
		this.name=name;
		
	}
	public String toString(){
		return"["+name+","+pages+"]";
	}
}
class PageSorter implements Comparator{
	public int compare(Object x1,Object x2){
		Book b1=(Book)x1;
		Book b2=(Book)x2;
		return b1.pages-b2.pages;
	}
}
class NameSorter implements Comparator{
	public int compare(Object x1,Object x2){
		Book b1=(Book)x1;
		Book b2=(Book)x2;
		return b1.name.compareToIgnoreCase(b2.name);
		}}