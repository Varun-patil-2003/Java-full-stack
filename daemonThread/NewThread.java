package com.daemonThread;

public class NewThread {

	public void run() {
		// TODO Auto-generated method stub

		
	}
	public static void main(String[] args) throws Exception {
		for (int i = 1; i <= 5; i++) {
			Thread.sleep(2000);
			System.out.println(i);
		}
	}
}
