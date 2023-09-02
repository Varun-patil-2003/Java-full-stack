package com.join;

public class JoinDemo extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName()+"-->"+i);
				Thread.sleep(1000);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args)throws InterruptedException {
		
		//Thread t = new Thread();
		//JoinDemo.join();
		
		JoinDemo td = new JoinDemo();
		td.start();
		td.join();		//wait until execution of another thread
		
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Main Thread"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		JoinDemo jd = new JoinDemo();
		jd.start();
		
	}
}
