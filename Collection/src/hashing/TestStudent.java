package hashing;

import java.util.HashSet;
import java.util.Set;

public class TestStudent {

	public static void main(String[] args) {
Set s=new HashSet();
Student s1=new Student("ram",6,500);
Student s2=new Student("kam",4,200);
Student s3=new Student("kam",6,800);
Student s4=new Student("ram",6,500);
s.add(s1);
s.add(s2);
s.add(s3);
s.add(s4);
for(Object k:s){
	System.out.println(k);
}
System.out.println(s1.hashCode()==s3.hashCode());
System.out.println(s1.equals(s4));
	}

}
class Student{
	String name;
	int std;
	int marks;
	Student(String name,int std ,int marks){
		this.name=name;
		this.std=std;
		this.marks=marks;
		
	}
	public boolean equals (Object x){
		Student s=(Student)x;
		return this.name.equals(s.name) && this.std==s.std &&this.marks==s.marks;
	}
	public int hashCode(){
		return std;
	}
	public String toString(){
		return "["+name+","+std+","+marks+"]";
	}
}