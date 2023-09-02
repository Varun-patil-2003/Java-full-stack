package com.interfaces;

public class Main1 implements Interface1 {

	public static void main(String[] args) {
		Main1 m = new Main1();
		m.display();
		Interface1.show();	// Static method access by interface name
		m.test(); 			// 
		// ((Interface1) m).call(); Private should not be call
	}

	@Override
	public void display() {
		System.out.println("Display method in Main1 class");
		
	}

}
