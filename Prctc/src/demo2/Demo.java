package demo2;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
Emp []e=new Emp[4];
e[0]=new Emp("shaan",3000,341);
e[1]=new Emp("bhaan",2000,340);
e[2]=new Emp("khaan",5000,301);
e[3]=new Emp("ahaan",4000,349);

Arrays.sort(e,new NameSorter());
for(Emp k:e){
	System.out.println(k);
}
System.out.println("-----------");
Arrays.sort(e,new IdSorter());
for(Emp k:e){
	System.out.println(k);
	}
System.out.println("-----------");

Arrays.sort(e,new SalarySorter());
for(Emp k:e){
	System.out.println(k);
}}}
class Emp{
	String name;
	int salary;
	int id;
	Emp(String name,int salary,int id){
		this.name=name;
		this.salary=salary;
		this.id=id;
	}
	public String toString(){
		return "["+name+","+id+","+salary+"]";
	}
	}
class NameSorter implements Comparator{
	public int compare(Object x1,Object x2){
		Emp e1=(Emp)x1;
		Emp e2=(Emp)x2;
		return e1.name.compareToIgnoreCase(e2.name);		
}}
class SalarySorter implements Comparator{
	public int compare(Object x1,Object x2){
		Emp e1=(Emp)x1;
		Emp e2=(Emp)x2;
		return e1.salary-e2.salary;
	}}
class IdSorter implements Comparator{
	public int compare(Object x1,Object x2){
		Emp e1=(Emp)x1;
		Emp e2=(Emp)x2;
		return e1.id-e2.id;
	}
}