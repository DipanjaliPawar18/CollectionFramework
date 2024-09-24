package com.listInterfaceDemo;

import java.util.ArrayList;

public class StrinArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<>();
		
		s.add("Bhopal");
		s.add("Indore");
		s.add("Betul");
		s.add("Pune");
		s.add("Mumbai");
		s.add("Vidisha");
		s.add(null);
		
		System.out.println(s);
		
		for(Object o : s) {
			System.out.println("Arraylist includes city : "+ o);
		}
	}
}