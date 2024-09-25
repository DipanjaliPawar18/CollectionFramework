package com.setInterface;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet h1 = new HashSet(100);
		HashSet<Integer> h2 = new HashSet<>(100, (float) 0.90);
		h1.add("hii");
		h1.add(23);
		h1.add(null);
		h1.add(23);
		
		System.out.println(h1);
		
		HashSet<Integer> h3 = new HashSet<>(100);
		//h3.add(null);
		h3.add(12);
		h3.add(45);
		h3.add(90);
		h3.add(3);
		
		System.out.println("set 1 : "+h3);
		
		h2.add(67);
		h2.add(45);
		h2.add(9);
		h2.add(300);
		
		System.out.println("set 2 : "+h2);
		
		
		System.out.println("Is subset : "+h2.containsAll(h3));
		// intersection
		h3.retainAll(h2);
		System.out.println("Intersection of these two : "+h3);
		// union 
		h3.addAll(h2);
		System.out.println("Union of these two : "+h3);
		
		
		h2.add(18);
		
		System.out.println("set 1 : "+h3);
		System.out.println("set 2 : "+h2);
		// difference
		h3.removeAll(h2);
		System.out.println("Difference of these two : "+h3);
		
		h3.remove(3);
		System.out.println(h3);
		System.out.println(h3.isEmpty());
		System.out.println(h3.contains(44));
		System.out.println(h3.size());
	}
}