package com.daemonThread;

public class MultiThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("-----------------------------------");
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws Exception {
		MultiThread m = new MultiThread();
		m.start();
		
		MultiThread m1 = new MultiThread();
		m1.start();
	}
}
