package com.multithreading;

class Customer{
	
	int amount ;
	
	Customer(int amount){
		this.amount = amount;
	}
	
	// synchronized method
	synchronized void withdraw(int amount) {
		
		System.out.println("This is withdraw method...!");
		if(this.amount < amount) {
			System.out.println("Low balance... Please deposite!!");
			
			try {
				wait(); // block if insufficient balance
			} catch(Exception e) {
				e.printStackTrace();
			}
			// after deposit check if the amount is sufficient or not
			if(this.amount >= amount) {
				this.amount -= amount;
				System.out.println("Withdrawal successful...!");
			} else {
				System.out.println("Insufficient balance...! can't withdraw " + amount);
			}
		}
		// if the amount is sufficient just withdraw
		else {
		    this.amount -= amount;
			System.out.println("Withdrawal successful...!");
		}
		// Checking balance at the end
		System.out.println("Available balance : " + this.amount);
	}
	
	synchronized void deposit(int amount) {
		System.out.println("This is deposit method...");
		this.amount += amount; // add amount
		System.out.println("Deposited successfully...!");
		notify(); // notify when deposited
		
		System.out.println("Available balance after deposit : " + this.amount);
	}
} 

public class CustomerThread {

	public static void main(String[] args) {
		// object of customer
		Customer c = new Customer(1000);
		// initializing and starting withdraw related thread first
		new Thread() {
			public void run() {
				c.withdraw(2000);
			}
		}.start();
		// deposit related thread initialization and starting
		new Thread() {
			public void run() {
				c.deposit(500);
			}
		}.start();
	}
}