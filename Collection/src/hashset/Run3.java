package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Run3 {

	public static void main(String[] args) {
HashSet<String> hs=new HashSet<String>();
hs.add("ravi");
hs.add("kavi");
hs.add("gavi");
hs.add("yavi");
hs.add("bavi");
Iterator<String> ir= hs.iterator();
while(ir.hasNext()){
	System.out.println(ir.next());
}

	}

}
