package demo;

import java.util.Arrays;

public class TestEmp {

	public static void main(String[] args) {
		Emp[]e1=new Emp[2];
		e1[0]=new Emp("Tka",400,5005);
		e1[1]=new Emp("bka",401,5001);
		Arrays.sort(e1);
		for(Emp em:e1){
			System.out.println(em);
		}

	}

}
class Emp implements Comparable{
	String name;
	int id;
	int sal;
	Emp(String name,int id,int sal){
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public String toString(){
		return"["+name+","+id+","+sal+"]";
	}
	public int compareTo(Object y){
		Emp e=(Emp)y;
		return name.compareToIgnoreCase(e.name);
	}
}