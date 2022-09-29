package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//only when we deal with array or collections
		// we can use for each loop/enhanced loop/advanced for loop
		
		String[] iceCream= {"vanila", "Chocolate","Pistashio", "Kulfi","mango"};

		for(String flavor:iceCream) { //data type variable name : Stirng name which we have elements
			
			System.out.println(flavor);
		}
		
		System.out.println("******************************");
		
		char[]grade = {'A','B','C','D','E','F'};
		
		for(char letter :grade) {
			
			System.out.print(letter + " ");
		}
		
		System.out.println("******************************");
		
		//give all elements using regular loop
		
		int [] numbers = {12, 56,345,1, 0, 9};
		
		for(int i=0; i<numbers.length; i++) {
			
			System.out.print(numbers[i] + " ");
			
			
		}
		//give all elements using enhance loop
		//this loop always loops only 1 way : from start till end
		
		for(int num: numbers) {
			
			System.out.print(num+ " ");
		}
		
	}

}
