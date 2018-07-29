package demo;

import java.util.Arrays;

public class TestBook {

	public static void main(String[] args) {
		Book[]b1=new Book[4];
		b1[0]=new Book("java",234);
		b1[1]=new Book("lava",756);
		b1[2]=new Book("ghava",101);
		b1[3]=new Book("dhaba",100);
		System.out.println("Before sorting");
		for(Book bk:b1){
			System.out.println(bk);
			
		}
		System.out.println("after sorting");
		Arrays.sort(b1);
		for(Book bk:b1){
			System.out.println(bk);
		}


	}

}
class Book implements Comparable{
	String bname;
	int pages;
	Book(String bname,int pages){
		this.bname=bname;
		this.pages=pages;
	}
	public String toString(){
		return "["+bname+", "+pages+"]";
	}

public int compareTo(Object x){
	Book b=(Book)x;
	return this.pages - b.pages;
	
}
}