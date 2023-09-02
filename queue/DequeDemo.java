package com.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<Integer> d = new ArrayDeque<Integer>();
		d.add(10);
		d.add(50);
		d.add(20);
		d.add(150);
		d.offerFirst(5);
		d.offerLast(90);
		d.addFirst(15);
		d.addLast(25);
		//d.clear();
		
		for(int i:d) {
			System.out.print(i+" ");
		}
		System.out.println(d.contains(25));
		d.clear();
		System.out.println(d.isEmpty());
	}
}
