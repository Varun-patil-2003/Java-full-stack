package com.string;

public class ReverseString1 {
	public static void main(String args[])
	{
		String a = "VARUN";
		
		for(int i = 0;i<a.length();i++)
		{
			System.out.print(a.charAt(i));
		}
		System.out.println();
		System.out.println("Reversed String : ");
		for(int j = a.length()-1;j>=0;j--)
		{
			System.out.print(a.charAt(j));
		}
	}
}
