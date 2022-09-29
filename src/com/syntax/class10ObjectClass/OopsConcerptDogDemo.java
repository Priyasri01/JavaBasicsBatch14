package com.syntax.class10ObjectClass;

public class OopsConcerptDogDemo {  //class will care attributes and method

	
	//they call this as state  /attributes /properties/fields
	String name;
	String color;
	String breed;
	double weight;
	int age;
	
	// this we called as method/Behavior/function
	void bark() {
		
		System.out.println("Barking.................");
		
	}
	
	void sleep() {
		
		System.out.println("Dog is sleeping...................");
	}

	public static void main(String[]args) {
		
		//creating object from a class
		//new dog();--->it create an object of class dog
		
		OopsConcerptDogDemo  dog1= new OopsConcerptDogDemo ();   //class name  variable name = new className
        // calling a behavior on an object
        dog1.bark();
        dog1.sleep();
 
		
		
	}
	
}
