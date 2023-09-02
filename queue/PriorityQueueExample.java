package com.queue;

import java.util.Iterator;
import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<Integer> q2 = new PriorityQueue<>();
		q2.offer(50);
		q2.offer(100);
		q2.add(150);
		//q2.offer(10);
		System.out.println("Peek "+q2.peek());	// prints but not delet element
		System.out.println("Poll "+q2.poll());	// deletes poll element
		
		Iterator itr = q2.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
}
