package demo5;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {

	public static void main(String[] args) {
Pencil[]p=new Pencil[4];
p[0]=new Pencil("red",6,3);
p[1]=new Pencil("green",4,3);
p[2]=new Pencil("black",2,3);
p[3]=new Pencil("yellow",9,3);
Arrays.sort(p,new ColorSorter());
for(Pencil p1:p){
	System.out.println(p1);
}
System.out.println("----------");
Arrays.sort(p,new SizeSorter());
for(Pencil p1:p){
	System.out.println(p1);

	}

}}
class Pencil{
	String pcolor;
	int psize;
	int pno;
	Pencil(String pcolor,int psize,int pno){
		this.pcolor=pcolor;
		this.psize=psize;
		this.pno=pno;
	}
	public String toString(){
		return "["+pcolor+","+psize+","+pno+"]";
	}
}
class ColorSorter implements Comparator{
	public int compare(Object x1,Object x2){
		Pencil p1=(Pencil)x1;
		Pencil p2=(Pencil)x2;
return p1.pcolor.compareTo(p2.pcolor);
		
	}
}
class SizeSorter implements Comparator{
	public int compare(Object x1,Object x2){
		Pencil p1=(Pencil)x1;
		Pencil p2=(Pencil)x2;
		return p1.psize-p2.psize;
}}