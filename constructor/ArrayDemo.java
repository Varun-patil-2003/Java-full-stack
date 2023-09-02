package com.constructor;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int arr[] = new int [0];
		System.out.println(arr[0]);		// Exception java.lang.ArrayIndexOutOfBoundsException
		
		/*
		int arr[] = new int [-3];
		arr[-2] = 10;
		System.out.println(arr[-3]);	// Exception java.lang.NegativeArraySizeException
		*/
		
		/*arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;	//compiled and run successfully
		arr[4] = 50;
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" ");
		*/
	}

}
