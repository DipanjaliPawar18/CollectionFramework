package com.iteratorInterface;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapNew {
	public static void main(String[] args) {
		
		HashMap<Object, Object> map = new HashMap<>();
		HashMap<Integer, String> map1 = new HashMap<>();
		
		map.put(1,"Hello");
		map.put("lang","Java");
		map.put(3.4,"Program");
		map.put("type","Program");
		System.out.println(map);
		map.remove(3.4);
		map.put("type", "OOP");
		System.out.println(map);
		
		System.out.println();
		map1.put(1, "India");
		map1.put(2, "America");
		map1.put(3, "Africa");
		map1.put(4, "Japan");
		System.out.println(map1.keySet());
		System.out.println(map1);
		System.out.println(map1.containsKey(5));
		System.out.println(map1.containsValue("India"));
		System.out.println(map1.get(5));
		System.out.println(map1);
		System.out.println(map1.size());
		
		 Iterator<Object> itr = map.keySet().iterator();
		 
		 while(itr.hasNext()) {
			 System.out.println(itr.next() + " ");
		 }
	}
}
