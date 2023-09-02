package com.arrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {

	public static void main(String[] args) {
		LinkedList<Double> a = new LinkedList<>();
		a.add(20.20);
		a.add(30.30);
		a.add(10.15);
		a.add(null);
		
		System.out.println(a);
		
		/*
		for (Iterator i = a.iterator(); i.hasNext();) {
			Double double1 = (Double) i.next();
			System.out.print(" "+double1);
		}
		*/
//		for (int i = 0; i < 3; i++) {
//			System.out.println(a+" ");
//		}
		
		Iterator<Double> itr =a.iterator();	//object of iterator
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
