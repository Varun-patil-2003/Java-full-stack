package com.string;

public class Consonant {

	public static void main(String args[])
	{
		String a = "India is my country";
		//int count = 0,cout = 0;
		System.out.println(a);
		String c = a.toLowerCase();
		char []b = c.toCharArray();
		for(int i=0;i<a.length();i++)
		{
			if(c.charAt(i)=='a'||c.charAt(i)=='e'||c.charAt(i)=='i'||c.charAt(i)=='o'||c.charAt(i)=='u') 
			{
				//count++;
			}
			else
			{
				System.out.print(b[i]);
			}
		}
	}
}
