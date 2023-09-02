package com.map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		/*
		 * 1. It stores key, value pairs --> 1, Pune 2, Mumbai
		 * 2. It is not thread safe
		 * 3. It does not allow duplicate keys but value allowed
		 */
		HashMap<Integer, String>hm = new HashMap<>();
		hm.put(1, "Pune");
		hm.put(2, null);
		hm.put(3, "Mumbai");
		hm.put(4, "Banglore");
		hm.put(5, "Pune");
		hm.put(6, null);
		System.out.println(hm);
	}

}
