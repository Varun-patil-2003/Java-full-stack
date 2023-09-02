package com.inheritence;

public class Engine {

	void cDetails()
	{
		System.out.println("Engine class method");
	}
	public static void main(String args[])
	{
		Engine E = new Engine();
		E.cDetails();
		Vehicle v = new Vehicle();
		v.Break();
	}
}
