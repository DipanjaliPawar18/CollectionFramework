package com.setInterface;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class SetIntoList {

	public static void main(String[] args) {
		
		HashSet<Integer> h = new HashSet<>(100);
		h.add(34);
		h.add(20);
		h.add(67);
		h.add(4);
		h.add(90);
		System.out.println("Set is : "+h);
		
		ArrayList<Integer> a1 = new ArrayList<>(h);
		System.out.println("List : "+a1);
		
		Collections.sort(a1);
		System.out.println("After sorting : " + a1);
	}

}
