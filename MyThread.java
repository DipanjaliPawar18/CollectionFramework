package com.multithreading;

class Thread2 implements Runnable{
	// Implement runnable interface
	@Override
	public void run() {
		System.out.println("This thread using runnable interface..");
	}
}

public class MyThread {

	public static void main(String[] args) {
		// Object of Thread2 - Instantiation
		Thread2 t = new Thread2();
		// Object of Thread class pass the object of Thread2 in it
		Thread t1 = new Thread(t); 
		t1.start(); // Run the thread
	}
}