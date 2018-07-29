package demo;

import java.util.Arrays;
import java.util.Comparator;

public class UsingComptor {

	public static void main(String[] args) {
NBook[]nb=new NBook[4];
nb[0]=new NBook("aba",4,778);
nb[1]=new NBook("kaba",2,775);
nb[2]=new NBook("gaba",1,773);
nb[3]=new NBook("Dhaba",3,774);

System.out.println("Before Sorting");
for(NBook nk:nb){
	System.out.println(nk);
}
System.out.println();
System.out.println("Sorting by pages");
Arrays.sort(nb,new PageSorter());
for(NBook nk:nb){
	System.out.println(nk);
}
System.out.println();
System.out.println("Sorting by Name");
Arrays.sort(nb,new NameSorter1());
for(NBook nk:nb){
	System.out.println(nk);
}
System.out.println();
System.out.println("Sorting by Bid");
Arrays.sort(nb,new BidSorter());
for(NBook nk:nb){
	System.out.println(nk);
}
	}
	}





class NBook {
	String name;
	int bid;
	int pages;
	NBook(String name,int bid,int pages){
		this.name=name;
		this.bid=bid;
		this.pages=pages;
	}
	public String toString(){
		return "["+name+","+bid+","+pages+"]";
	}
	
}
class NameSorter1 implements Comparator{
	public int compare(Object x1,Object x2){
		NBook n1=(NBook)x1;
		NBook n2=(NBook)x2;
		return n1.name.compareToIgnoreCase(n2.name);
	}}
class PageSorter implements Comparator{
	public int compare(Object x1,Object x2){
		NBook n1=(NBook)x1;
		NBook n2=(NBook)x2;
		return n1.pages-n2.pages;
	}
}
class BidSorter implements Comparator	{
public int compare(Object x1,Object x2){
	NBook n1=(NBook)x1;
	NBook n2=(NBook)x2;
	return n1.bid-n2.bid;
}}