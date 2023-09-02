package com.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class UserDefinedObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();	//index wise, duplicates allowed, sequence maintain
		Mobile m1 = new Mobile();
		m1.setModelNo(1208);
		m1.setName("Nokia");
		m1.setMaterial("Plastic");
		m1.setCamera(null);
		
		Mobile m2 = new Mobile(14, "iPhone", "Alloy", "12mp");
		
		Mobile m3 = new Mobile(8, "Redmi", "Metal", "48mp");
		
		Mobile m4 = new Mobile(21, "Samsung", "Metallic", "50mp");
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		System.out.println(al);
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		System.out.println(al);
		System.out.println("--------------");
		
		HashSet hs = new HashSet(al);
		System.out.println(hs);
	}

}
