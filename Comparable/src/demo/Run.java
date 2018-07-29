 package demo;

import java.util.Arrays;

public class Run {

	public static void main(String[] args) {
Novel[]n=new Novel[2];
n[0]=new Novel("ilu",277);
n[1]=new Novel("fluv",276);
for(Novel no:n){
	System.out.println(no);
}
System.out.println("after sorting");
Arrays.sort(n);
for (Novel n1:n){
	System.out.println(n1);
}
	}

}
class Novel implements Comparable{
	String title;
	int pages;
	Novel(String title,int pages){
		this.title=title;
		this.pages=pages;
	}
	public String toString(){
		return "["+title+","+pages+"]";
	}
	//public int compareTo(Object z){
		//Novel no=(Novel)z;
		//return this.pages-no.pages;
	public int compareTo(Object x){
		Novel no=(Novel)x;
		return this.title.compareToIgnoreCase(no.title);
	}
}