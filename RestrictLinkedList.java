package com.listInterfaceDemo;

import java.util.Collections;
import java.util.LinkedList;

public class RestrictLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<>();
		
		l.add(23);
		l.add(45);
		l.add(12);
		l.add(20);
		l.addLast(100);
		l.addFirst(1);
		
		System.out.println(l);
		System.out.println(l.size());
		Collections.sort(l);
		System.out.println(l);
		
		l.remove();
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		Collections.shuffle(l);
		System.out.println(l);
		System.out.println(l.contains(1));
		
		LinkedList<Integer> l_new = new LinkedList<>();
		l_new.addAll(l);
		System.out.println(l_new);
		l.clear();
		System.out.println(l);
		
	}

}
