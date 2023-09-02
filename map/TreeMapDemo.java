package com.map;

import java.util.TreeMap;

public class TreeMapDemo {
/*
 * 1. It also stores key value pairs
 * 2. Duplicate null key is not allowed but null values are allowed
 * 3. It is not Synchronized 
 * 4. It returns keys in sorted manner
 */
	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		t.put(100, "Ganesh");
		t.put(90, "Abhijit");
		t.put(50, null);
		t.put(50, "Pune");
		t.put(80, "Gayatri");
		t.put(88, null);
		System.out.println(t);
		
		System.out.println(t.ceilingKey(91));
		System.out.println(t.higherKey(88));
		System.out.println(t.descendingMap());
	}
}
