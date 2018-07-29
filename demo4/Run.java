package demo4;

public class Run {

	public static void main(String[] args) {
Address a2 =new Address(100,"marathahalli","bangalore");
Address a1 =new Address(101,"halli","ctc");
Department b=new Department("physics",1,111);
Department b1=new Department("chem",2,211);
Student s=new Student("bibhu",1,a2,b);
System.out.println(s.name);
System.out.println(s.a.area);
System.out.println(s.b.deptname);
	}

}
class Address{
	int streetno;
	String area;
	String city;
	Address(int streetno,String area,String city){
		this.streetno=streetno;
		this.area=area;
		this.city=city;
	}
}
class Department{
	String deptname;
	int deptno;
	int deptid;
	Department(String deptname,int deptno,int deptid){
	this.deptname=deptname;
	this.deptid=deptid;
	this.deptno=deptno;
	}
}
class Student{
	String name;
	int id;
	Address a;
	Department b;
	Student(String name,int id,Address a,Department b){
		this.name=name;
		this.id=id;
		this.a=a;
		this.b=b;
		
	}
}