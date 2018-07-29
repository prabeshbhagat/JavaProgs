package linkedlist;

import java.util.LinkedList;

public class Program1 {

	public static void main(String[] args) {
LinkedList l1=new LinkedList();
l1.add(23);
l1.add(26);
l1.add(28);
l1.add(29);
l1.add(2, 97);
System.out.println(l1);
l1.remove(3);
System.out.println(l1);
	}

}
