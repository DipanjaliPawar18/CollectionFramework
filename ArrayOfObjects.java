package com.arrayOfObjects;

class Employee{
	
	int id;
	int age;
	String name;
	
	Employee(){
		
	}
	
	Employee(int id,String name,int age) {
		this.name =name;
		this.id = id;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Roll number : "+this.id+" Name : " + this.name+" Grade : "+this.age );
	}
}

class Student{
	
	int rollNo;
	String name;
	String grade;
	
	Student(int rollNo, String name, String grade){
		this.rollNo =rollNo;
		this.name = name;
		this.grade = grade;
	}
	
	public void display() {
		System.out.println("Roll number : "+this.rollNo+" Name : " + this.name+" Grade : "+this.grade );
	}
}

public class ArrayOfObjects {

	public static void main(String[] args) {
	
		Student [] arr;
		
		arr = new Student[3];
		arr[0] = new Student(1,"Joe","A");
		arr[1] = new Student(1,"Harry","B");
		arr[2] = new Student(1,"Max","A");
		System.out.println("Information of students : ");
		arr[0].display();
		arr[1].display();
		arr[2].display();
		
		System.out.println();
		
		Employee[] arr1 = new Employee[4];
		
		arr1[0]= new Employee(23, "Jackey", 22);
		arr1[1]= new Employee(24, "John", 30);
		arr1[2]= new Employee(25, "Varun", 25);
		arr1[3]= new Employee(26, "Aana", 19);
		System.out.println("Information of employee : ");
		arr1[0].display();
		arr1[1].display();
		arr1[2].display();
		arr1[3].display();
	}
}