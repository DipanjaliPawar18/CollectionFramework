package com.listInterfaceDemo;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		//declaration
		ArrayList a1 = new ArrayList();
		//List a1 = new ArrayList();
		//ArrayList<Integer> a1 = new ArrayList<>();
		
		a1.add(1);
		a1.add('H');
		a1.add("Java");
		a1.add(true);
		a1.add(3.5);
		a1.add(null);
		
		System.out.println(a1);
		System.out.println(a1.get(1));
		
		System.out.println("One by one elements of arraylist :");
		for(Object o : a1) {
			System.out.println(o);
		}
		System.out.println(a1.isEmpty());
	}
}