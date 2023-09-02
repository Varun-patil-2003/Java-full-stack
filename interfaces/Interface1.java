package com.interfaces;

public interface Interface1 {

	    void display();
	    
	    static void show() {
	        System.out.println("Static method in interface");
	    }

	    default void test() {
	        System.out.println("Default method in interface");
	        // call(); // Calling the private method indirectly
	    }

	    private void call() {
	        System.out.println("Private method in interface");
	    }

	    public static void main(String[] args) {
	        Interface1 impl = new Interface1() {
	            public void display() {
	                System.out.println("Display method implementation");
	            }
	        };
	        impl.call();
	    }

	}
