package com.syntax.class09;

public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create an array of animals and store 5 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 */
		
		String[] animals= {"cow" , "Deer", "Duck" , "Eagle" , "calf"};
		
		for(int i=0; i<animals.length; i++) {
			
			System.out.println(animals[i]);
		
			
		}
		
		System.out.println("*************************Enhance Loop****************************************");
		
		for(String animal:animals) { //for every elements in array , print the element
			System.out.println(animal); // in here animals represent elements of the array
		}
		
	}

}
