
import java.util.Arrays;
import java.util.Comparator;

public class UsingComparator {

	public static void main(String[] args) {

		Employee[] emparr = { new Employee("ram", 27, 10.2),
				new Employee("sam", 23, 22.53), new Employee("dam", 24, 12.35),new Employee("dkam",25,11.6)};

		System.out.println("printing without sorting");
		for (Employee empobj : emparr) {
			System.out.println(empobj);// printing without sorting
		}
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("sorting by age");
		Arrays.sort(emparr, new AgeSorter());
		for (Employee empobj : emparr) {
			System.out.println(empobj);
		}
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("sorting by salary");
		Arrays.sort(emparr, new SalSorter());
		for (Employee empobj : emparr) {
			System.out.println(empobj);
		}
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("sorting by name");
		Arrays.sort(emparr, new NameSorter());
		for (Employee empobj : emparr) {
			System.out.println(empobj);
		}
	}
}

class Employee {
	String name;
	int age;
	double sal;

	Employee(String n, int a, double s) {
		name = n;
		age = a;
		sal = s;
	}

	public String toString() {
		return "[" + name + "," + age + "," + sal + "]";
	}

}

class AgeSorter implements Comparator {
	public int compare(Object x1, Object x2) {
		Employee e1 = (Employee) x1;
		Employee e2 = (Employee) x2;
		return e1.age - e2.age;
	}
}

class SalSorter implements Comparator {
	public int compare(Object x1, Object x2) {
		Employee e1 = (Employee) x1;
		Employee e2 = (Employee) x2;
		return (int) (e1.sal - e2.sal);
	}
}

class NameSorter implements Comparator {
	public int compare(Object x1, Object x2) {
		Employee e1 = (Employee) x1;
		Employee e2 = (Employee) x2;
		return e1.name.compareTo(e2.name);
	}
}