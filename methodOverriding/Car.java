package com.methodOverriding;

public class Car extends Vehicle {

	
	void run()
	{
		System.out.println("Car Called ...");
	}
	public static void main(String args[])
	{
		Car c = new Car();
		c.run();
		
		Vehicle v = new Vehicle();
		v.run();
		
		Bus b = new Bus();
		b.run();
		
		Bike c1 = new Bike();
		c1.run();
	}
}
