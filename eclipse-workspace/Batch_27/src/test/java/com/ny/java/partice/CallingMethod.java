package com.ny.java.partice;

public class CallingMethod {

	//This is a static method 
	public static void getSalary() {
		System.out.println("I am static method");
			
	}
	
	//This is non-static method
	public void getName() {
		
		System.out.println("I am Non-Static method");
	}
	//How we can call the static and non-static method.
	
	public static void main(String[] args) {
		//static method we can call by the class name.
		CallingMethod.getSalary();
		
		//non-static method calling by the creating the object.
		//How to create an object?
		// by class name 
		
	//className    objectName = new  className();
//How java understand that you create a object? Help of the NEW Kwyword
		
		CallingMethod objName = new CallingMethod(); 
		objName.getName();
	
		
	}
	
	
	
}
