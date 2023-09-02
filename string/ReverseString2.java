package com.string;

public class ReverseString2 {
	public static void main(String args[])
	{
		String a = "Mumbai";
		char []b = a.toCharArray();
		System.out.println("String is "+a);
		System.out.println("String reverse :- ");
		for(int i = b.length-1;i>=0;i--)
		{
			System.out.print(b[i]);
		}
	}
}
