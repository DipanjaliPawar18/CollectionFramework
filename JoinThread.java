package com.multithreading;

class Thread3 extends Thread{
	
	public void run() {
		
		for(int i=1;i<=5;i++) {
			
			try {
			Thread.sleep(400);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread running currently "+Thread.currentThread().getName());
			System.out.println(i);
		}
	}
}

public class JoinThread {

	public static void main(String[] args) {
	
		Thread3 t1 = new Thread3();
		Thread3 t2 = new Thread3();
		Thread3 t3 = new Thread3();
		
		t1.start();
		
		try {
		t1.join();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		t2.start();
		t3.start();
	}
}