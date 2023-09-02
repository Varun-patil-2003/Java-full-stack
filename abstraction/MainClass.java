package com.abstraction;

public class MainClass extends MasterClass {

	public static void main(String[] args) {
		// main function

		MainClass m = new MainClass();
		m.function();
		m.test();
		m.test2();
		System.out.println(a);
	}

	@Override
	void test() {
		// abstract test method
		System.out.println("This is test method");
	}

	@Override
	void test2() {
		// abstract test2 method
		System.out.println("This is test2 method");
	}

}
