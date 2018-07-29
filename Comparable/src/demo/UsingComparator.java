package demo;

import java.util.Arrays;
import java.util.Comparator;

public class UsingComparator {

	public static void main(String[] args) {
		Employee []e=new Employee[4];
		e[0]=new Employee(56,5000,"aish");
		e[1]=new Employee(51,4999,"bish");
		e[2]=new Employee(28,8888,"aaish");
		e[3]=new Employee(27,9999,"kaish");
		System.out.println("printing without sorting");
		for(Employee emp:e){
			System.out  .println(emp);
		}
 System.out.println();
 System.out.println("sorting by age");
 System.out.println("sorting by age");
	Arrays.sort(e, new AgeSorter());
	for (Employee emp1 : e) {
		System.out.println(emp1);
	}
	System.out.println();
	System.out.println("sorting by salary");
	Arrays.sort(e, new SalarySorter());
	for (Employee emp1 : e) {
		System.out.println(emp1);
	}
	System.out.println();


	System.out.println("sorting by name");
	Arrays.sort(e, new NameSorter());
	for (Employee emp1 : e) {
		System.out.println(emp1);
	}}
}



class Employee{
	int age;
	int sal;
	String name;
	Employee(int age,int sal,String name){
		this.age=age;
		this.sal=sal;
		this.name=name;
	}
	public  String  toString() {
		return "["+name+","+sal+","+age+"]";
	}
}
	class AgeSorter implements Comparator{
		public int compare(Object x1,Object x2){
			Employee e1=(Employee)x1;
			Employee e2=(Employee)x2;
			return  (e1.age - e2.age);
		}
	}
	class SalarySorter implements Comparator{
				public int compare(Object x1,Object x2){
					Employee e1=(Employee)x1;
					Employee e2=(Employee)x2;
					return  (e1.sal - e2.sal);

			
			
		}
	}
	class NameSorter implements Comparator{
		public int compare(Object x1,Object x2){
			Employee e1=(Employee)x1;
			Employee e2=(Employee)x2;
			return  e1.name.compareToIgnoreCase(e2.name);
		}}
