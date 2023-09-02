package com.arrayList;

import java.util.ArrayList;

public class FirstCollection {

	public static void main(String args[]) 
	{
		ArrayList<Object> sc=new ArrayList<>();
		
		int a=12;//primitive dataType
		int b=13;// primitive dataType
		int c=45;// primitive dataType
		String name="ABCD";
		
		sc.add(a);// Object
		sc.add(b);// object
		sc.add(c);// object
		sc.add(name);
		sc.remove(1);
		
		System.out.println(sc.size());
		System.out.println(sc);
	}
}
