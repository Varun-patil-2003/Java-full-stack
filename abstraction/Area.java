package com.abstraction;

public abstract class Area {

	public void circle(double r) {
		final double pie = 3.14;
		float area = (float) (pie*r*r);
		System.out.println("Area of Circle = "+area);
	}
	
	public void triangle(double b,double h) {
		float area = (float) ((b*h)/2);
		System.out.println("Area of triangle = "+area);
	}
	
	public void square(int l,int b) {
		int area = l*b;
		System.out.println("Area of square = "+area);
	}	
}
