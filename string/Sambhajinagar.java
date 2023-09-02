package com.string;

public class Sambhajinagar {

	public static void main(String args[])
	{
		String s = "sambhajinagar";
		String a = s.toLowerCase();
		String b = s.toUpperCase();
		char []c = a.toCharArray();
		char []d = b.toCharArray();
		for(int i=0;i<a.length();i++)
		{
			if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u') 
			{
				System.out.print(c[i]);
			}
			else
			{
				System.out.print(d[i]);
			}
		}
	}
}
