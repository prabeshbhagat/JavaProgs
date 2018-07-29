package list;

import java.util.ArrayList;

public class Program3 {

	public static void main(String[] args) {
ArrayList <String> al =new ArrayList <String> ();
al.add("bana");
al.add("gana");
al.add("tana");
al.add("dana");
al.add(2, "cana");
System.out.println(al);
System.out.println("using for each loop");
for(Object k:al){
	System.out.println(k);
}
	}

}
