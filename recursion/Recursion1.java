package com.recursion;

public class Recursion1 {

	int a = 1;
	void display()
	{
		int count = a++;
		System.out.println("Recursive element = "+count);
		if (a<=10)
		{
			display();
		}
	}
	public static void main(String args[])
	{
		Recursion1 R = new Recursion1();
		R.display();
	}
}
