package com.constructor;

public class ParConstruct {

	public ParConstruct()
	{
		System.out.println("Empty Constructor");
	}
	
	public ParConstruct(int a)
	{
		System.out.println("Parameterized Constructor a = "+a);
	}
	
	public ParConstruct(int a,int b)
	{
		System.out.println("Parameterized Constructor a+b = "+(a+b));
	}
	
	public static void main(String[] args) {
		ParConstruct P = new ParConstruct();
		ParConstruct Q = new ParConstruct(10);
		ParConstruct R = new ParConstruct(10, 20);
	}

}
