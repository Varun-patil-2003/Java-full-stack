package com.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

public class LinkedListDemo {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(50);
		q.add(10);
		q.add(30);
		
		for(int i : q) {
			System.out.println("Linked List : "+i);
		}
		
		Queue<Integer> q1 = new PriorityQueue<>();
		q1.add(50);
		q1.add(100);
		q1.add(10);
		q1.add(25);
		
		Iterator<Integer> itr = q1.iterator();
		System.out.println("\n"+"PriorityQueue ");
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
}
