package com.multithreading;

class Thread1 extends Thread {
	// Extend the Thread class
	public void run() {
		System.out.println("New thread is running now...");
	}
}

public class NewThread {

	public static void main(String[] args) {
		// Create the object of Thread1 - instantiation
		Thread1 t = new Thread1();
		t.start(); // Start the thread
		System.out.println("Main thread..!!!");
	}
}