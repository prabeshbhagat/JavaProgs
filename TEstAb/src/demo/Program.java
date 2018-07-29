package demo;

import java.util.HashSet;
import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
HashSet<String> hs=new HashSet <String> ();
hs.add("akash");
hs.add("ziakash");
hs.add("takash");
hs.add("rakash");
Iterator itr=hs.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}
	}

}
