package test;

public class Demo5 {

	public static void main(String[] args) {
Address a1=new Address(234,"bangalore");
Address a2=new Address(555,"mumbai");
Address a3=new Address(777,"ctc");
Department d1=new Department("physics",3);
Department d2=new Department("maths",6);
Department d3=new Department("chem",4);
Emp e1=new Emp(2,"akash",a3,d3);
System.out.println(e1.ename);
System.out.println(e1.a.sname);

	}

}
class Department{
String dname;
int deptno;
Department(String dname,int deptno){
	this.deptno=deptno;
	this.dname=dname;
}
}
class Address{
	int sno;
	String sname;
	Address(int sno,String sname){
		this.sname=sname;
		this.sno=sno;
	}
}
class Emp{
	int empno;
	String ename;
	Address a;
	Department d;
	Emp(int empno,String ename,Address a,Department d){
		this.a=a;
		this.d=d;
		this.empno=empno;
		this.ename=ename;
	}
}