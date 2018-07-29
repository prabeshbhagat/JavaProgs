package demo6;

import java.util.Arrays;

public class TestEmp {

	public static void main(String[] args) {
Emp1[]e=new Emp1[4];
e[0]=new Emp1("akash",55);
e[1]=new Emp1("bikash",52);
e[2]=new Emp1("tikash",50);
e[3]=new Emp1("lakash",49);
System.out.println("before sorting");
for(Emp1 a:e){
	System.out.println(a);
	}
System.out.println("after sorting");
Arrays.sort(e);
for(Emp1 k:e){
	System.out.println(k);
}
}

}
class Emp1 implements Comparable{
	String name;
	int age;
	Emp1(String name,int age){
		this.name=name;
		this.age=age;
		}
		public String toString(){
			return "["+name+","+age+"]";
		}
		
	
public int compareTo(Object x){
	Emp1 e=(Emp1)x;
	return this.name.compareToIgnoreCase(e.name);
}}