package demo;

import java.util.Arrays;

public class TestEmp {

	public static void main(String[] args) {
Emp[]e=new Emp[4];
e[0]=new Emp("takash",77);
e[1]=new Emp("kakash",87);
e[2]=new Emp("bakash",76);
e[3]=new Emp("akash",79);
System.out.println("before sorting");
for(Emp a:e){
	System.out.println(a);
}
System.out.println("after sorting");
Arrays.sort(e);
for(Emp k:e){
	System.out.println(k);
}
	}

}
class Emp implements Comparable{
	int age;
	String name;
	Emp(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return"["+name+","+age+"]";
	}
	public int compareTo(Object a){
		Emp x=(Emp)a;
		return this.name.compareToIgnoreCase(x.name);
	}
}
