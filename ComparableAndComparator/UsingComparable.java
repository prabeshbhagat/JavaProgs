package com.ojm18.ComparableAndComparator;


import java.util.Arrays;

public class UsingComparable {

	public static void main(String[] args) {

		Book [] arr = {new Book(100,"j"),new Book(220,"c"),new Book(250,"cpp")};
		System.out.println("b4 sorting");
		for(Book bk1 : arr){
			System.out.println(bk1);
		}
		System.out.println("aftr sortng");
		Arrays.sort(arr);
		for(Book bk1 : arr){
			System.out.println(bk1);
		}

}
	}

class Book implements Comparable{
	
	int pages;
	String title;
	
	Book(int p,String t){
		pages = p;
		title = t;
	}
	
	public String toString(){
		return "["+title+","+pages+"]";
	}
	//sorting based on pages
	public int compareTo(Object x){
		
		Book b1 = (Book)x;
		return pages - b1.pages;
	}
	//sorting based on title
	/*public int compareTo(Object x){
		
		Book b1 = (Book)x;
		return title.compareTo(b1.title);
	}*/
}