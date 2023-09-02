package com.methods;

import java.util.*;
public class Students {
	void student104()
	{
		System.out.println("Name : Pradip Pawar");
		System.out.println("Age : 21");
		System.out.println("Mo. No. : 916246354");
	}
	void student101()
	{
		System.out.println("Name : Shamsundar Patil");
		System.out.println("Age : 21");
		System.out.println("Mo. No. : 9262463354");
	}
	void student102()
	{
		System.out.println("Name : Varun Patil");
		System.out.println("Age : 21");
		System.out.println("Mo. No. : 9322246354");
	}
	void student32()
	{
		System.out.println("Name : Gaurav Patil");
		System.out.println("Age : 20");
		System.out.println("Mo. No. : 9189246354");
	}
	void student22()
	{
		System.out.println("Name : Kaushal Kathar");
		System.out.println("Age : 22");
		System.out.println("Mo. No. : 816246354");
	}
	void student50()
	{
		System.out.println("Name : Sidheshwar Jadhav");
		System.out.println("Age : 22");
		System.out.println("Mo. No. : 775546354");
	}
	public static void main(String args[])
	{
		Students S = new Students();
		Scanner foo = new Scanner(System.in);
		System.out.println("Enter roll no : ");
		int a = foo.nextInt();
		if(a == 22)
		{
			S.student22();
		}
		if(a == 32)
		{
			S.student32();
		}
		if(a == 102)
		{
			S.student102();
		}
		if(a == 101)
		{
			S.student101();
		}
		if(a == 104)
		{
			S.student104();
		}
		if(a == 50)
		{
			S.student50();
		}
		foo.close();
	}
}
