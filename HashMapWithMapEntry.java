package com.entryInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapWithMapEntry {

	public static void main(String[] args) {

		HashMap<String, Double> book = new HashMap<>();
		
		book.put("Focus on what matters", 199.0);
		book.put("Do it today", 150.0);
		book.put("Self Improvement", 775.0);
		book.put("Bhagwat Geeta", 229.0);
		
		Set<Map.Entry<String , Double>> s = book.entrySet();

		System.out.println("Single entry reading with for loop : ");
		for ( Map.Entry<String, Double> it: s) {
			System.out.println(it.getKey()+" "+it.getValue());
			
			if(it.getKey().equals("Bhagwat Geeta")) {
				it.setValue(350.50);
			}
		}
		
		System.out.println();
		
		Iterator<Entry<String, Double>> itr = s.iterator();
		
		System.out.println("Single entry reading with iterator after changing value : ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println(s);
	}
}