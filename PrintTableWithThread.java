package com.multithreading;

class Table{
	
	synchronized void printTable(int num) {
		System.out.println("Table of " + num);
		for(int i=1; i<=10; i++) {
			System.out.println(num*i);
		}
	}
}

class Table1 extends Thread{
	
	Table t;
	Table1(Table t) {
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}
}

class Table2 extends Thread{
	
	Table t;
	Table2(Table t) {
		this.t = t;
	}
	public void run() {
		t.printTable(10);
	}
}

public class PrintTableWithThread {

	public static void main(String[] args) {
		
		Table t = new Table();
		Table1 t1 = new Table1(t);
		Table2 t2 = new Table2(t);
		t1.start();
		t2.start();
	}
}