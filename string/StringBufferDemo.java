package com.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		
		StringBuffer sb1 = new StringBuffer(100);
		System.out.println(sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer("ABC");
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer();
		System.out.println(sb3.capacity());
		System.out.println(sb3.append("MaharashtraIndia1"));
		System.out.println(sb3.capacity());
	}
}
