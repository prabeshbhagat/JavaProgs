package priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;



public class Program {

	public static void main(String[] args) {
PriorityQueue<String> pr =new PriorityQueue<String>();
pr.add("maga");
pr.add("baga");
pr.add("taga");
pr.add("jaga");
pr.add("raga");
System.out.println(pr);
System.out.println(pr.peek());
Iterator ir =pr.iterator();
while(ir.hasNext()){
	System.out.println(ir.next());
}
pr.remove();
System.out.println(pr);
pr.poll();
System.out.println(pr);
System.out.println("size  " +pr.size());
	}

}
