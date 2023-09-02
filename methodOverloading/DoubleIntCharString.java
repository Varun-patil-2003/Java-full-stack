package com.methodOverloading;

public class DoubleIntCharString {

	public int hell(int a)
	{
		return a;
	}
	public double hell(double a)
	{
		return a;
	}
	public char hell(char a)
	{
		return a;
	}
	public String hell(String a)
	{
		return a;
	}
	public float hell(float a)
	{
		return a;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoubleIntCharString d = new DoubleIntCharString();
		System.out.println(d.hell(5));
		System.out.println(d.hell('b'));
		System.out.println(d.hell("Varun"));
		System.out.println(d.hell(7.5));
		System.out.println(d.hell(6.6f));
	}

}
