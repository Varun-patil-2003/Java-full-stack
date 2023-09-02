package com.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		/*
		 * 1. Duplicates not allowed
		 * 2. Insertion order is not preserved
		 * 3. Null value allowed
		 * 4. It implements serilizable, clonable interface
		 * 5. Homogeneous and heterogeneous allowed
		 * 6. Default capacity = 16 B
		 * 7. Default load factor = 0.75
		 * 8. Non-synchronized class
		 */
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(null);
		hs.add(10);
		System.out.println(hs);
		
		HashSet<String> h = new HashSet<String>();
		h.add("Varun");
		h.add("Gaurav");
		h.add("Pradip");
		h.add("Sid");
		System.out.println(h);
		
		HashSet<Float> s = new HashSet<Float>(10, 2.7f);	// capacity * Load Factor
		s.add(10.9f);
		s.add(10.0f);
		s.add(1.9f);
		HashSet<Object> o = new HashSet<Object>(s);
		o.add(89);
		o.add("Hwllo");
		o.add(hs);
		System.out.println(o);		
		
	}

}
