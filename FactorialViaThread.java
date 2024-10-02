package com.multithreading;

class Fact{
	
	synchronized void printFact(int n) {
		
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact *= i;
			System.out.println(fact);
		}
		System.out.println("Factorial of " +n+ " is " + fact);
		
		try {
			Thread.sleep(300);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Fact1 extends Thread{
	Fact f;
	
	public Fact1(Fact f) {
		this.f = f;
	}
	public void run() {
		f.printFact(5);
	}
}

class Fact2 extends Thread{
	Fact f;
	
	public Fact2(Fact f) {
		this.f = f;
	}
	public void run() {
		f.printFact(10);
	}
}

public class FactorialViaThread {

	public static void main(String[] args) {
		
		Fact obj = new Fact();
		Fact1 f1 = new Fact1(obj);
		Fact2 f2 = new Fact2(obj);
		
		f1.start();
		f2.start();
	}
}