package demo;

public class Student1 {
	int id;
	String name;
	int age;
	Student1(int i,String n){
		id =i;
		name=n;
		}
	Student1(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	void dispaly(){
		System.out.println(id+" "+name+" "+age);
	}

	public static void main(String[] args) {
		Student1 s1=new Student1(2,"bikash");
		Student1 s2=new Student1(4,"akash",23);
        s1.dispaly();
        s2.dispaly();
	}
     
}
