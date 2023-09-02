package com.string;

public class StrinBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		
		StringBuilder sb1 = new StringBuilder(50);
		System.out.println(sb1.capacity());
		
		StringBuilder sb2 = new StringBuilder("Welcome");
		System.out.println(sb2.capacity());
	}
}
