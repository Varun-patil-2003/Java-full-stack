package com.arrayList;

import java.util.LinkedList;

public class LLDemo {

	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<String>();
		a.add("Pune");
		a.add(null);
		a.add(2, null);
		a.addFirst("123");
		System.out.println(a.clone());
		System.out.println(a.size());
		System.out.println("Clone "+a.clone());
		a.clear();
		System.out.println(a);
		
		a.add("varun");
		System.out.println(a.contains("pune"));
		System.out.println(a.contains("varun"));
	}

}
