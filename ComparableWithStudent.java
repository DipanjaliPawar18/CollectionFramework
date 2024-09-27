package com.compareObject;

import java.util.ArrayList;
import java.util.Collections;

class Students implements Comparable<Students>{

	int rollNo;
	String name;
	double percent;
	
	Students(int rollNo, String name, double percent){
		this.rollNo = rollNo;
		this.name = name;
		this.percent = percent;
	}
	
	@Override
	public int compareTo(Students o) {
		if(o.percent == percent)
			return 0;
		
		else if(o.percent > percent)
			return 1;
		
		else 
			return -1;
	}	
}

public class ComparableWithStudent {

	public static void main(String[] args) {

		ArrayList<Students> s = new ArrayList<>();
		
		s.add(new Students(10, "Mark", 88.4));
		s.add(new Students(7, "Neo", 85.65));
		s.add(new Students(18, "DP", 96.6));
		s.add(new Students(12, "Cloee", 92.5));
		
		Collections.sort(s);
		
		for(Students std : s) {
			System.out.println(std.rollNo + " " + std.name + " " + std.percent);
		}
	}
}