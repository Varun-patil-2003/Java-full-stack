package com.inheritence;

public class Car extends Vehicle {

	void cDetails()
	{
		System.out.println("This is car class method");
	}
	
	public static void main(String args[])
	{
		Car c1 = new Car();
		c1.cDetails();
		c1.Break();
		c1.engine();
		c1.gear();
	}
}
