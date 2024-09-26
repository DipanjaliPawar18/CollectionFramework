package com.compareObject;

import java.util.ArrayList;

import java.util.Collections;

class Employee implements Comparable<Employee>{

	int id;
	String name;
	double salary;
	
	Employee(int id,String name,double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		if(salary == o.salary)
		return 0;
		
		else if(salary> o.salary)
			return 1;
		
		else
			return -1;
	}
}

public class ByComparableImplementation {

	public static void main(String[] args) {

		ArrayList<Employee> a = new ArrayList<>();
		
		a.add(new Employee(12, "John" , 50000));
		a.add(new Employee(54, "Henna" , 45500));
		a.add(new Employee(23, "Joe" , 75000));
		a.add(new Employee(12, "Max" , 60400));
		
		Collections.sort(a);
		
		for(Employee e : a) {
			System.out.println(e.id + " " + e.name + " " + e.salary);
		}
	}
}