package com.ojm18.stringClass;

public class EqualsMethosDemo1 {

	public static void main(String[] args) {
		Emp e1 = new Emp("linku",6025);
		Emp e2 = new Emp("linku",6025);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
	}

}

class Emp{
	String name;
	int id;
	Emp(String name,int id){
		this.name=name;
		this.id = id;
	}
	public String toString(){
		return "["+name+","+id+"]";
	}
	public boolean equals(Object x){
		Emp e = (Emp)x;
		return name.equals(e.name) && id == e.id;
	}
}

