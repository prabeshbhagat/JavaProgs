package demo6;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
Emp []e=new Emp[4];
e[0]=new Emp("akash",300);
e[1]=new Emp("bikash",300);
e[2]=new Emp("takash",300);
e[3]=new Emp("rakash",300);
for(Emp t:e){
	System.out.println(t);
}
System.out.println();
Arrays.sort(e,new EnameSorter());
for(Emp t:e){
	System.out.println(t);
}
	}

}
class Emp{
	String ename;
	int empno;
	Emp(String ename,int empno){
		this.ename=ename;
		this.empno=empno;
		
		
	}
	public String toString(){
		return "["+ename+","+empno+"]";
	}
}
class EnameSorter implements Comparator{
	public int compare(Object x1,Object x2){
		Emp e1=(Emp)x1;
		Emp e2=(Emp)x2;
		return e1.ename.compareToIgnoreCase(e2.ename);

	}
}