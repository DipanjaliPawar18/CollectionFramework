package com.listInterfaceDemo;

import java.util.ArrayList;
import java.util.Collections;

public class IntArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> a2 = new ArrayList<>();
		
		a2.add(23);
		a2.add(45);
		a2.add(74);
		a2.add(57);
		//a2.add(null);

		System.out.println("Original arraylist : "+a2);
		System.out.println("Size of the arraylist : "+a2.size());
		System.out.println(a2.contains(45));
		
		a2.set(2, 18);
		System.out.println("After alteration : "+ a2);
		
		System.out.println(a2.get(2));
		
		System.out.println("One by one elements of arraylist :");
		for(Object o : a2) {
			System.out.println(o);
		}
		System.out.println(a2.isEmpty());
		
		Collections.sort(a2);
		System.out.println("After sorting : "+ a2);
	}
}