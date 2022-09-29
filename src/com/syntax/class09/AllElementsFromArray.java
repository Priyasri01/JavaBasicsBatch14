package com.syntax.class09;

public class AllElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] iceCream= {"vanila", "Chocolate","Pistashio", "Kulfi","mango"};
		
		//how to get all values?
		
		for(int i=0; i<iceCream.length; i++) { //make user in array when we do iteration always <
			
			System.out.println(iceCream[i]);
		}
		
		System.out.println("***********************************************************");
		char [] letters= {'A', 'B','c','D','F'};
		
		for(int i=0; i<letters.length; i++) {
			
			System.out.print(letters[i]+ " ");
			
		}
				

	}

}
