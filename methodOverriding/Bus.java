package com.methodOverriding;

public class Bus extends Bike {

	@Override
	void run()
	{
		System.out.println("Bus Called ...");
	}
	
	public static void main(String args[])
	{
		Bike b1 = new Bus();
		b1.run();
		
		
	}
}
