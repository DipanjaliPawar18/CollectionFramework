package com.setInterface;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
			
			LinkedHashSet<Integer> h1 = new LinkedHashSet<>(100);
			LinkedHashSet<Integer> h2 = new LinkedHashSet<>(100, (float) 0.90);
			
			h2.add(12);
			h2.add(45);
			h1.add(90);
			h1.add(3);
			
			System.out.println("set 1 : "+h1);
			
			h2.add(67);
			h2.add(45);
			h2.add(9);
			h2.add(300);
			
			System.out.println("set 2 : "+h2);
			
			
			System.out.println("Is subset : "+h2.containsAll(h1));
			// intersection
			h1.retainAll(h2);
			System.out.println("Intersection of these two : "+h1);
			// union 
			h1.addAll(h2);
			System.out.println("Union of these two : "+h1);
			
			
			h2.add(18);
			
			System.out.println("set 1 : "+h1);
			System.out.println("set 2 : "+h2);
			// difference
			h1.removeAll(h2);
			System.out.println("Difference of these two : "+h1);
			
			h1.remove(3);
			System.out.println(h1);
			System.out.println(h1.isEmpty());
			System.out.println(h1.contains(44));
			System.out.println(h1.size());
	}

}