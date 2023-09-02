package com.arrayList;

import java.util.ArrayList;

public class ArrayListCollectionDemo {

	public static void main(String[] args) {
		// ArrayList<Integer> array = new ArrayList<>();
		ArrayList<Integer> array = new ArrayList<>();
		
		int a = 10;
		float b = 11.00f;
		char c = 'V';
		double d = 12.50;
		String e = "BCS";
		long f = 9322669924l;
		
		array.add(a);
		/*
		array.add(b);
		array.add(c);
		array.add(d);
		array.add(e);
		array.add(f);
		
		
		System.out.println(array);
		
		array.remove(0);
		array.remove(1);
		array.remove(2);
		//array.remove(1);
		
		System.out.println(array);
		*/
		
		array.add(0, 7);
		System.out.println(array);
		
		ArrayList<Float> fa = new ArrayList<>();
		fa.add(b);
		fa.add(90.f);
		fa.add(34.90f);
		fa.add(56.099f);
		
		ArrayList<Character> fb = new ArrayList<>();
		fb.add(c);
		
		ArrayList<Double> fc = new ArrayList<>();
		fc.add(d);
		fc.add(90.);
		fc.add(34.90);
		fc.add(56.099);
		
		ArrayList<Long> fd = new ArrayList<>();
		fd.add(f);
		
		ArrayList<String> fe = new ArrayList<>();
		fe.add(e);
		fe.add("Sham");
		fe.add("Pradip");
		fe.add("Siddhu");
		fe.add("Varun");
		fe.add("Gaurav");
		
		System.out.println(array +"\n"+fa+"\n"+fb+"\n"+fc+"\n"+fd+"\n"+fe);
		
		ArrayList<Object> ff = new ArrayList<>();
		ff.add(1);
		ff.add(array);
		ff.add(fb);
		ff.add(fd);
		System.out.println("ff object : "+ff+"\nSize of ff = "+ff.size());
	}
}
