package com.methodOverloading;

public class Add {

		public int add(int a)
		{
			return (a);
		}
		public int add(int a,int b)
		{
			int c;
			return c=a+b;
		}
		public int add(int a,int b,int c)
		{
			int d;
			return d = a+b+c;
		}
		
		public static void main(String args[])
		{
			Add foo1 = new Add();
			System.out.println(foo1.add(5));
			System.out.println(foo1.add(7, 5));
			System.out.println(foo1.add(1, 2, 3));
		}
}
