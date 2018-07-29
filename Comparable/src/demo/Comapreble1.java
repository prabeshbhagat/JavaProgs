package demo;

import java.util.Arrays;

public class Comapreble1 {
	public static void main(String[] args) {
Student[] arr={new Student(5,"bibhu",22),new Student(2,"akash",55)};
System.out.println("b4 sorting");
for(Student st:arr){
	System.out.println(st);
	
}
System.out.println("after sorting");
Arrays.sort(arr);
for(Student st : arr){
	System.out.println(st);
}
	}
}
class Student implements Comparable{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return "["+name+","+rollno+","+age+"]";

	}
	public int compareTo(Object x){
		Student s=(Student)x;
		return this.rollno-s.rollno;
	}

}
