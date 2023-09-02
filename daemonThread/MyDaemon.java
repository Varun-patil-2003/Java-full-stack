package com.daemonThread;

public class MyDaemon extends Thread {

	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		} else {
			System.out.println("Another Thread");
		}
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyDaemon m = new MyDaemon();
		m.setDaemon(true);
		System.out.println(Thread.currentThread().isDaemon());
		m.start();
	}
}
