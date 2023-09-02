package com.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IteratorDemo {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<Integer>();	
		h.add(010);
		h.add(20);
		h.add(30);
		h.add(null);
		Iterator<Integer> i = h.iterator();
//		while (i.hasNext()) {
//			System.out.println(i);
//		}
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		Set<Integer>s = new HashSet<Integer>();
		Set<Object>o = new LinkedHashSet<Object>();
		o.add("Bye");
		System.out.println(o);
	}

}
