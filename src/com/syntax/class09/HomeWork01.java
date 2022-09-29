package com.syntax.class09;

public class HomeWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array.
		 */
		
		
		String [] cars= new String[6];
		
		cars[0]="Tesla";
		cars[1]="BMW";
		cars[2]="Maruthi";
		cars[3]="Mercedes";
		cars[4]="Honda";
		cars[5]="kia";
		
		for(int i=0; i<cars.length;i++) {
			
			System.out.println(cars[i]);
		}
		
		System.out.println("****************Enhance loop*****************");

		for(String name:cars) {
			
			System.out.println(name);
		}
	}

}
