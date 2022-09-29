package com.syntax.class12StringManupliation;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this one is proper way of creating objects.
		String str= new String("Java");
		//provided by Java Creators to make our life a little easier
		String name="Java"; // only works  for string and wrapper classes.
		
		/*
		 * counts the number of characters in a string includes the spaces
		 */
		
		
		System.out.println(str.length()); // this is the one method for identify the length
		System.out.println(name.length());
		
		 if(name.length()>15) {
	            System.out.println("Name can't be more than 15 characters");
	        }
		

	}

}
