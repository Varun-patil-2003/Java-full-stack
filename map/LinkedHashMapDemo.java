package com.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
/*
 * 1. LinkedList + HashMap
 * 2. It stores value as key value pair
 * 3. Duplicate keys not allowed
 * 4. It Should have only unique values
 * 5. Null keys are allowed. multiple null also allowed
 * 6. Insertion order preserved 
 * 7. Default capacity = 16 B
 * 8. Load factor = 0.75 --> initial cap 20 --> 15+20 --> 35 B
 */
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> l = new LinkedHashMap<>();
		l.put(101, "Prasad");
		l.put(105, "Isha");
		l.put(102, "Pratiksha");
		l.put(103, "Rohini");
		System.out.println(l);
		
		System.out.println(l.hashCode());
		System.out.println(l.containsKey(105));
		System.out.println(l.clone());
		System.out.println(l.isEmpty());
		//System.out.println(l.merge(110, "Gopal", null));
		System.out.println(l.remove(103, "Rohini"));
		System.out.println(l);
		System.out.println(l.size());
	}
}
