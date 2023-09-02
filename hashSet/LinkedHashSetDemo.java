package com.hashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Object>l = new LinkedHashSet<>();
		l.add("Vivekanand");
		l.add("College");
		l.add(null);
		System.out.println(l);
		
		LinkedHashSet<Float>lh = new LinkedHashSet<Float>();
		lh.add(55.20f);
		lh.add(78.3f);
		lh.add(55.55f);
		lh.add(55.2f);
		System.out.println(lh);
	}
}
