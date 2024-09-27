package com.compareObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employees implements Comparator<Employees>{

	int id;
	String name;
	double salary;
	
	Employees(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compare(Employees o1, Employees o2) {
		return 0;
	}
}

class Salary implements Comparator<Employees>{

	@Override
	public int compare(Employees o1, Employees o2) {
		if(o1.salary == o2.salary)
			return 0;
		
		else if(o1.salary > o2.salary)
			return 1;
		
		else
			return -1;
	}
}

class ID implements Comparator<Employees>{

	@Override
	public int compare(Employees o1, Employees o2) {
		if(o1.id == o2.id)
			return 0;
		
		else if(o1.id > o2.id)
			return 1;
		
		else
			return -1;
	}
}

public class ComparatorWithEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employees> e = new ArrayList<>();
		
		e.add(new Employees(48, "Alex", 65000));
		e.add(new Employees(23, "Bob", 62000));
		e.add(new Employees(56, "Max", 45000));
		e.add(new Employees(16, "Harry", 55000));
		
		Collections.sort(e, new ID());
		System.out.println("After sorting by id : ");
		for(Employees emp : e) {
			System.out.println(emp.id + " " + emp.name + " " + emp.salary);
		}
		System.out.println();
	
		Collections.sort(e, new Salary());	
		
		Iterator<Employees> it = e.iterator();
		System.out.println("After sorting by salary : ");
		while(it.hasNext()) {
			System.out.println(it.id);
		}
	}
}