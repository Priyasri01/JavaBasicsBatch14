package replit;

import java.util.Scanner;

public class Replit105 {

	public static void main(String[] args) {
		/*
		 * There is a code that takes input as a String.

Write a program that will print out only vowels of that string

Sample input/outputs:
		 */
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below

	    System.out.println(word.replaceAll(("[^a e i o u]"),(""))); // meaning expect a e i o u , replace all other character to ""
	    
	   

	}

}
