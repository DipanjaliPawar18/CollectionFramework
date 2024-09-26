package com.compareObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparator<Student>{

	int age;
	String name;
	
	Student(int age, String name){
		this.age = age;
		this.name = name;
	}
	@Override
	public int compare(Student o1, Student o2) {
		return 0;
	}
}

class Age implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.age == o2.age)
			return 0;
		
		else if(o1.age > o2.age)
			return 1;
		
		else
			return -1;
	}	
}

class Name implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

public class ByComparatorImplementation {

	public static void main(String[] args) {
		
		ArrayList<Student> a = new ArrayList<>();
		
		a.add(new Student(24, "John" ));
		a.add(new Student(21, "Henna"));
		a.add(new Student(18, "Joe"));
		a.add(new Student(20, "Max"));
		
		System.out.println("After sorting by age : ");
		Collections.sort(a, new Age());
		for(Student e : a) {
			System.out.println(e.age + " " + e.name );
		}
		
		System.out.println("After sorting by name : ");
		Collections.sort(a, new Name());
		for(Student e : a) {
			System.out.println(e.age + " " + e.name );
		}
	}
}