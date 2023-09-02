package com.constructor;

public class ArrayString {
	public static void main(String args[])
	{
		int a[][] = new int[3][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		a[2][0] = 7;
		a[2][1] = 8;
		a[2][2] = 9;
		
		for (int i = 0; i < 3; i++)
		{
			System.out.println();
			for(int j = 0; j < 3; j++)
			{
				System.out.print(a[i][j]+" ");
			}
		}
		
		System.out.println();
		int c[][] = {{1,2},{3,4},{5,6}};
		System.out.println(c[0][0]);
		System.out.println(c[0][1]);
	
		System.out.println(c[1][0]);
		System.out.println(c[1][1]);
		
		System.out.println(c[2][0]);
		System.out.println(c[2][1]);
		
		
		String b[][] = new String[3][2];
		b[0][0] = "ab";
		b[1][0] = "ba";
		
		System.out.println(b[0][0]);
		System.out.println(b[1][0]);
		
	}
}
