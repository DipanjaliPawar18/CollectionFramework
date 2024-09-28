package com.generics;

class Test <T>{
	T obj;
	Test(T obj){
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
}

public class GenericClassDemo {

	public static void main(String[] args) {
		
		Test<Integer> rObj = new Test<>(18);
		
		System.out.println("Roll no :" + rObj.getObject());
		
		Test<String> nObj = new Test<>("Dipanjali");
		
		System.out.println("Name : " + nObj.getObject());
	}
}