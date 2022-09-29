package com.syntax.class10ObjectClass;

public class Phone { //creating Phone Class 
	
	String make;
	String model;
	String color;
	int year;
	int storage;
	
	
	void makeCall() { // note we are typing void , void means no return value. All these are we define behavior of the "Phone" class
		
		System.out.println("Making a call using.........." + model);
	}
	
	void takePicture() {
		
		System.out.println("Taking Pictures");
	}
	
	void browseInternet() {
		
		System.out.println("Browsing the internet using " + model);
	}

	
		
	}

