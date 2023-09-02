package com.interfaces;

public interface Interface2 {
	
	int a = 10;
	public static void main(String[] args) {
		System.out.println(a);
		
		int b = 20;
		System.out.println(b);
		
		//int b = 30;  Duplicate local variable b
		b = 30;
		System.out.println(b);
		
	}
}
