package com.listInterfaceDemo;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		l1.addFirst("Hello");
		l1.add(23);
		l1.add(34.67);
		l1.add(true);
		l1.addLast("Bye");
		
		System.out.println(l1);
	}

}
