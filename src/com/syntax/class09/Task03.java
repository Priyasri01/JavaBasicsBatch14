package com.syntax.class09;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Create an array of words: Java, Saturday, day, coding, is. 
 * Print the following sentence using elements of array:
 *  “Saturday is Java coding Day”.
 *  
 *  
 */
		
		String []word = new String[5];
		
		word[0]="Java";
		word[1]="Saturday";
		word[2]="day";
		word[3]="coding";
		word[4]="is";
		
		System.out.println(word[1]+" " + word[4]+" " +word[0]+" "+word[3]+" "+word[2] );
		
	}

}
