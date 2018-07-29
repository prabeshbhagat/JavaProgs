package demo5;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Run4 {

	public static void main(String[] args) {
PriorityQueue pq =new PriorityQueue();
pq.add("banka");
pq.add("tanka");
pq.add("aanka");
pq.add("danka");
System.out.println(pq);
Iterator it=pq.iterator();
while(it.hasNext()){
	System.out.println(it.next());
}
System.out.println("++++++++++++++");
System.out.println(pq.peek());
pq.poll();
System.out.println(pq);

	}

}
