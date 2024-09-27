package com.iteratorInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapEx {

	public static void main(String[] args) {

		HashMap<Integer, String> hs = new HashMap<>();
		
		hs.put(1, "Ama");
		hs.put(2, "John");
		hs.put(6, "Ama");
		hs.put(92, "Lisa");
		hs.put(45, "Bella");
		hs.put(null, "Max");
		
		System.out.println(hs);
		
		System.out.println(hs.get(2));
		System.out.println(hs.get(3));
		
		hs.remove(6);
		hs.put(23, null);
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println("It contains a null key : "+ hs.containsKey(null));
		System.out.println("It contains a value Lisa : "+ hs.containsValue("Lisa"));
		System.out.println("It contains a null value : "+ hs.containsValue(null));
		System.out.println("Value at key null is : "+ hs.get(null));
		System.out.println(hs.get(23));
		System.out.println(hs.size());
		System.out.println(hs.entrySet());
		System.out.println(hs.keySet());
		
		// convert map to set
		Set<Map.Entry<Integer, String>> s = hs.entrySet();
		
		for ( Map.Entry<Integer, String> it: s) {
			System.out.println("single entry reading="+it.getKey()+" "+it.getValue());
		}
		System.out.println(s);
	}
}