package test;

import java.util.Arrays;

public class Type {

	public static void main(String[] args) {
Java[]j=new Java[3];
j[0]=new Java("poly",4);
j[1]=new Java("inhei",9);
j[2]=new Java("kj",2);

Arrays.sort(j);
for(Java k:j){
	System.out.println(k);
}
	}

}
class Java implements Comparable{
	String contents;
	int pages;
	Java(String contents,int pages){
		this.contents=contents;
		this.pages=pages;
		
	}
	public String toString(){
		return "["+contents+","+pages+"]";
	}
	public int compareTo(Object x){
		Java j1=(Java)x;
		return this.contents.compareTo(j1.contents);
	}
}