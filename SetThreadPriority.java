package com.multithreading;

class Threads extends Thread{
	
	Threads(String name, int priority){
		super(name);
		// set priority
		setPriority(priority);
	}
	
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(getName()+ " number" + " " + i);
		}
	}
}

public class SetThreadPriority {

	public static void main(String[] args) {
		// setting priority of threads
		Threads t1 = new Threads("High priority thread", Thread.MAX_PRIORITY);
		Threads t2 = new Threads("Mid priority thread", Thread.NORM_PRIORITY);
		Threads t3 = new Threads("Low priority thread", Thread.MIN_PRIORITY);		
		// Starting the threads
		t1.start();
		t2.start();
		t3.start();
	}
}