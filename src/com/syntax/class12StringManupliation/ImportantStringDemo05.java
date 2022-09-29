package com.syntax.class12StringManupliation;

import java.util.Arrays;

public class ImportantStringDemo05 {

	private static int countries;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= " I love java programming";
		
		System.out.println(str.charAt(0));
		 
		for(int i=0; i<str.length(); i++) {
			
			if(!(str.charAt(i)==' ')) { // to 
				
				System.out.print(str.charAt(i));
				
			}
		}
		/*
		 * to charrArry method will convert a string to an array of chars
		 * 
		 * 
		 */
		System.out.println();
		
		/*interview Question
		 * find out how many "u" letter in a this give value ?
		 * 
		 */
		String str2=" My name is murugesan";
		
		char[]charArray=str2.toCharArray(); //convert string to char
		
		System.out.println(Arrays.toString(charArray));
		System.out.println(charArray[7]); //specify the index number to get the value what we need
		System.out.println(charArray[5]);
		
		int count=0;
		
		for(char c:charArray) {
			
			if(c=='u') {
			 
				count++;
				
			}
			
			
		}
		
		System.out.println("letter has appread " + count + " times");
		
		
		
	}

}
