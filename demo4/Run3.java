package demo4;

 class Run3 {

	public static void main(String[] args) {
Emp e1=new Emp("bibhu",100);
System.out.println(e1);
Emp e2=new Emp("Bibhu",200);
System.out.println(e1.equals(e2));

	}

}
class Emp{
	String name;
	int id;
	Emp(String name,int id){
		this.name=name;
		this.id=id;
		
	}
	public String toString(){
		return "["+name+","+id+"]";
	}
	public boolean equals(Object x){
	Emp e=(Emp)x;
	return id==e.id;
	}
}