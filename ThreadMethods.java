package com.multithreading;

// use runnable interface if we have to share the thread among different tasks
// or if we have to implement some particular logic
class ThreadEx implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable thread running...!");
		// loop that runs from 1 to 10
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 0) // for printing even numbers
			System.out.println(i);

			try {
				Thread.sleep(100); // Thread delay of 100ms
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadMethods {

	public static void main(String[] args) {
		
		ThreadEx t = new ThreadEx();
		
		Thread th = new Thread(t);
		
		th.start();
		
	}
}