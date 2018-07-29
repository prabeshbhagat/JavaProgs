package newex;

public class Test {

	public static void main(String[] args) {
Address a=new Address("bangalore",560067);
Address a1=new Address("baang",6789);
Department d=new Department("mechanics",1);
Department d2=new Department("physics",5);
Emp e1=new Emp("bibhu",3456,a,d);
Emp e2=new Emp("aka",7891,a1,d2);
System.out.println(e2.name);
System.out.println(e1.name);
System.out.println(e1.empno);
System.out.println(e1.a.city);
System.out.println(e1.d.deptname);
	}

}
class Address{
	String city;
	int pinno;
	Address(String city,int pinno){
		this.city=city;
		this.pinno=pinno;
	}
}
class Department{
	String deptname;
	int deptno;
	Department(String deptname,int deptno){
		this.deptname=deptname;
		this.deptno=deptno;
	}
}
class Emp{
	String name;
	int empno;
	Address a;
	Department d;
	Emp(String name,int empno,Address a,Department d){
		this.name=name;
		this.empno=empno;
		this.a=a;
		this.d=d;
	}
}