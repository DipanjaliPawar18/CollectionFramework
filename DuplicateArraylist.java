package com.listInterfaceDemo;

import java.util.ArrayList;
import java.util.Collections;

public class DuplicateArraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(11);
		a.add(24);
		a.add(6);
		a.add(81);
		a.add(45);
		
		System.out.println("Original arraylist : "+ a);
		
		ArrayList<Integer> a_duplicate = new ArrayList<>();
		a_duplicate.addAll(a);
		System.out.println("Duplicate arraylist : " + a_duplicate);
		
		System.out.println("Size of arraylist : "+ a.size());
		
		System.out.println("List contains 6 in arraylist : "+ a.contains(6));
		
		System.out.println("Is the arraylist empty : "+ a.isEmpty());
		
		Collections.sort(a);
		System.out.println("Sorted arraylist : "+ a);
		
		System.out.println("One by one list of elements in arraylist :");
		
		for(Object o: a) {
			System.out.println(o);
		}
		
		a.get(1);
		
		a.set(1,12);
		System.out.println("Updated arraylist : "+ a);
		a.get(1);
		a.clear();
		System.out.println(a);
		System.out.println("Duplicate arraylist after clearing original one : "+ a_duplicate);
	}
}