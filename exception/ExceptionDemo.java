package com.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		} catch (ArithmeticException varun) {
			System.out.println(varun);
		}
	}
}
