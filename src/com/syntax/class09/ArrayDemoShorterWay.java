package com.syntax.class09;

public class ArrayDemoShorterWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// u can use double for value not for the size

		String[] drinks= {"fanta", "mik", "juice", "lemonade","water", "dr peper"};
		
		System.out.println(drinks[2]); //note size can't not be increased or decrese  in run time
	
		// how many elements inside my array?
		
	int size=drinks.length; // will give # of elements in the array
	System.out.println(" Size of array =" + size);
	}

}
