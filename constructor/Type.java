package com.constructor;

import java.util.*;
public class Type {

	public Type(String fname,String lname)
	{
		System.out.println(fname+" "+lname);
	}
	public Type(char a,char b)
	{
		
		System.out.println("Subtraction OF your characters : "+(a-b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String ffname = S.next();
		String llname = S.next();
		Type T = new Type(ffname,llname);
		
		System.out.println("Enter Two Characters :");
		char a1 = S.next().charAt(0);
		char a2 = S.next().charAt(0);
		Type U = new Type (a1,a2);
	}
}
