package com.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();		// empty linked list
		ll.add(10);
		
		LinkedList<Integer> ll1 = new LinkedList<Integer>(ll);
		ll1.add(50);
		
		// Linked list contains object
		LinkedList<Double> ll2 = new LinkedList<Double>();
		ll2.add(50.0);
		
		ArrayList<String> al = new ArrayList<String>();
		al.add(null);
		al.add("Mumbai");
		al.add("Pune");
		
		LinkedList<Object> ll3 = new LinkedList<Object>();
		ll3.add(ll);
		ll3.add(ll1);
		ll3.add(ll2);
		ll3.add(al);
		System.out.println(ll3);
		
		/*System.out.println(ll);
		System.out.println(ll2);*/
	}

}
