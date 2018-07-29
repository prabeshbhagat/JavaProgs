package demo5;

import java.util.ArrayList;
import java.util.List;

public class Run2 {

	public static void main(String[] args) {
List<String> l=new ArrayList<String>();
l.add("saha");
l.add("baka");
l.add("gava");
System.out.println(l.size());
System.out.println(l);
l.add(2, "lava");
System.out.println(l);
l.remove("baka");
System.out.println(l);
l.remove(2);
System.out.println(l);
for(Object k:l){
	System.out.println(k);
}
}
}