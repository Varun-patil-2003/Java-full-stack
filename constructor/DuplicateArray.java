package com.constructor;

import java.util.*;
public class DuplicateArray
{
	public static void main(String[] args) 
	{
		int temp,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array you want");
		n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the array elements");
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				temp=a[i];
				if(a[j]==temp)
				{
				  System.out.println(a[j]+" is duplicate");
				}
			}
		}
	}
}