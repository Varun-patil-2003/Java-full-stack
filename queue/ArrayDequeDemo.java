package com.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		Deque<Double>d = new ArrayDeque<Double>();
		d.add(20.2);
		d.addFirst(50.5);
		d.offer(60.6);
		d.add(80.9);
		
//		Iterator<Double> i = d.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		//d.remove(50.5);
//		d.removeLast();
		System.out.println(d);
//		System.out.println(d.poll());
//		System.out.println(d.poll());
//		System.out.println(d.pollFirst());
//		System.out.println(d.pollLast());
		System.out.println(d.peekLast());
		System.out.println(d.peekFirst());
		System.out.println(d);
	}
}
