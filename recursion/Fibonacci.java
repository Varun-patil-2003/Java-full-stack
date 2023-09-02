package com.recursion;

public class Fibonacci {

	int a=0,count=1;
	void display()
	{
		System.out.println(" "+a);
		if (a<10)
		{
			count = count + a;
			a = count;
			display();
		}
	}
	public static void main(String args[])
	{
		Fibonacci R = new Fibonacci();
		R.display();
	}
}
