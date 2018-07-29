package demo;

public class Student {
	int id;
	String name;
	Student(int i,String n){
		id=i;
		name=n;
	}
		void display1()
		{
			System.out.println(id+" "+name);
		}
	

	public static void main(String[] args) {
    Student s1=new Student(3,"akash");
    Student s2=new Student(4,"ghost");
    s1.display1();
    s2.display1();
	}

}
