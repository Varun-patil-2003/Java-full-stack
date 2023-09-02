package com.exception;

public class Test {

		void demo()
		{
		System.out.println("1");
		System.out.println("2");
		
		try {
		System.out.println(5/0);
		}
		catch (Exception e) {
			System.out.println("exception handelled");
			}
		System.out.println("3");	
		System.out.println("4");
		
			
		}
		
		public static void main(String[] args)
		{
		
			Test a1=new Test();
				
			a1.demo();		
		}
}
