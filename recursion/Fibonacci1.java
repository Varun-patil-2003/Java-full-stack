package com.recursion;

public class Fibonacci1 {
	    int a = 0;
	    int b = 1;

	    void display(int count) 
	    {
	        if (count <= 0) {
	            return;
	    }

	        System.out.print(a + " ");

	        int next = a + b;
	        a = b;
	        b = next;

	        display(count - 1);
	    }

	    public static void main(String[] args) {
	        Fibonacci1 fibonacci = new Fibonacci1();
	        int count = 10; // Number of Fibonacci numbers to generate
	        fibonacci.display(count);
	    }
}
