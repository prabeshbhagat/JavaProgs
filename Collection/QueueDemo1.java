package com.ojm18.Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo1 {

	public static void main(String[] args) {
		System.out.println("using priorityqueue: ");
		Queue q = new PriorityQueue();
		q.add(10);
		q.add(2);
		q.add(12);
		q.add(20);
		System.out.println("size: " + q.size());
		for (Object obj : q) {
			System.out.println(obj);
		}
		System.out.println("using methods in priority queue now...");
		while (q.peek() != null) {
			System.out.println(q.poll());
		}
		System.out.println("size: " + q.size());

		
	}

}
