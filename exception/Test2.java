package com.exception;

public class Test2 {

	public static void main(String[] args)
	{
		int a[]=new int [5];
		a[0]=10;
		a[1]=20;
			        a[2]=30;
			        a[3]=40;
			        a[4]=50;
			
			       try
			       {
			    	   a[5]=60;
			       }
			       catch (Exception e)
			       {
			    	  System.out.println(e);                 // for show the exception
			    	    System.out.println(e.getMessage());  // this is show the type of exception
			    	    e.printStackTrace();                  //  this is also show exception
			       }
			  
			        for(int i:a)   //   This is "for each" loop. 
			        {      	
			        	System.out.println(i);
			        	System.out.println(a[6]);
			        	
			        	try {
			        		System.out.println(a[6]);
			        		
			        	}
			        	catch(Exception e)
			        	{
			        		System.out.println("index out of bound");
			        		
			        	}		        	
			        }
	}
}