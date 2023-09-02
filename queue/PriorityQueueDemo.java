package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer>q=new PriorityQueue<>();
		q.add(10);
		q.offer(200);	// insert value anywhere
		q.add(100);
		q.add(20);
		q.add(50);
		System.out.println(q.hashCode());
		System.out.println(q.isEmpty());
		// q.clear();
		
		System.out.println(q.offer(150));
		
		for(int i:q) {
			System.out.println(i);
		}
	}
}
