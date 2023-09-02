package com.arrayList;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		/*
		 * 1. it allows homogeneous & heterogeneous
		 * 2.it allows duplicate
		 * 3. insertion order preserves
		 * 4. vector class implements serilizable, clonable, & Random access
		 * 5. methods present it vector are thread safe
		 */
		Vector v = new Vector();
		v.add(10);
		v.add(20.20);
		v.add("Abc");
		System.out.println(v);
		
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(null);
		v1.add(20);
		v1.add(30);
		v1.add(20);
		v1.add(null);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println("CAPACITY IS "+v1.capacity());
		v1.add(50);
		v1.add(60);
		v1.add(90);
		v1.add(80);
		v1.add(100);
		v1.add(500);
		System.out.println("CAPACITY IS "+v1.capacity());
		System.out.println(v1.clone());
	}

}
