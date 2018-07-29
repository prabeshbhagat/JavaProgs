package hashset;

import java.util.TreeSet;

public class Run2 {

	public static void main(String[] args) {
TreeSet tr=new TreeSet();
tr.add(34);
tr.add(35);
tr.add(36);
tr.add(37);
tr.add(38);
System.out.println(tr);
System.out.println("using for each loop");
for(Object k:tr){
	System.out.println(k);
}
	}

}
