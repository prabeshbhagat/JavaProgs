package has;

public class Run {

	public static void main(String[] args) {
Student s=new Student();
System.out.println(s.name="rajesh");

s.id=12;

s.a=new Address();
s.a.street=3;
s.a.area="marathahalli";
s.a.area="Bangalore";
	}

}
class Address{
	int street;
	String area;
	String city;
}
class Student{
	String name;
	int id;
	Address a;
}