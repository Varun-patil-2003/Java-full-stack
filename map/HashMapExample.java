package com.map;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "Prasad");
		h.put(2, "Omkar");
		h.put(3, "Mangesh");
		
		System.out.println(h.clone());
		System.out.println(h);
		
		h.remove(2, "Omkar");
		System.out.println(h);
		h.remove(1);
		System.out.println("Remaining "+h);
		
		System.out.println(h.replace(3, "Mangesh", "Pradip"));
		System.out.println(h);
	}
}
