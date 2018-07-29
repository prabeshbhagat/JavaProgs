package test;

import java.util.Arrays;
import java.util.Comparator;

public class Type2 {

	public static void main(String[] args) {
Student[]s=new Student[4];
s[0]=new Student(4,"fn");
s[1]=new Student(2,"kn");
s[2]=new Student(9,"tfn");
s[3]=new Student(5,"bfn");
Arrays.sort(s,new NameSorter());
for(Student h:s){
	System.out.println(h);
}
Arrays.sort(s,new NoSorter());
for(Student h:s){
	System.out.println(h);
	}
	}
}
class Student{
	int sno;
	String sname;
	Student(int sno,String sname){
		this.sno=sno;
		this.sname=sname;
	}
	public String toString(){
		return "["+sname+","+sno+"]";
	}
	
}
class NameSorter implements Comparator{
	public int compare(Object x1,Object x2){
		Student s1=(Student)x1;
		Student s2=(Student)x2;

		return s1.sname.compareTo(s2.sname);
	}
}
class NoSorter implements Comparator{
	public int compare(Object x1,Object x2){
		Student s1=(Student)x1;
		Student s2=(Student)x2;

		return s1.sno-s2.sno;
	}
}