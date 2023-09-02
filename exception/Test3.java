package com.exception;

public class Test3 {

	static String a="Sambhajinagar";
	static String b="Maharastra";
	static String c="NULL";	
			
	public static void main (String[] args)
	{
		System.out.println(a);
		System.out.println(a.charAt(1));
		System.out.println(b);
			
       try {
	    	   System.out.println(c.charAt(0));	    	   
	   }
       catch(ArithmeticException e)
       {
    	   System.out.println("this is Arithmatic Exception");
       }
		       
       catch (NullPointerException e)
       {
    	   System.out.println("NULL Exception");    	 
       }
       catch (Exception e)
       {
    	   System.out.println("Exception class");
       }		
	}
}
