package demo5;

import java.util.HashSet;
import java.util.Set;

public class TestStud {

	public static void main(String[] args) {
Set s=new HashSet();
s.add(new Student("bikash",23,9999));
s.add(new Student("tikash",23,9999));
s.add(new Student("kikash",23,9999));
for(Object el:s){
	System.out.println(el);
}
	}

}
class Student{
	String name;
	int sno;
	int sid;
	Student(String name,int sno,int sid){
		this.name=name;
		this.sno=sno;
		this.sid=sid;
	}
	public String toString(){
		return "["+name+","+sno+","+sid+"]";
	}
}