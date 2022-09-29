package com.syntax.class12StringManupliation;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first names and if they expecting boy or girl? 
Based on the input suggests a name for a baby:
		Example Output: Mom’s first name? Mary
			Dad’s first name? Daniel                       
			Boy or Girl? boy
			Suggested baby name: DANRY

		Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? girl
			Suggested baby name: MAIEL
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter Mom First Name");
		String momName=scan .next();
		System.out.println("Please enter Dad First Name");
		String dadName= scan.next();
		System .out.println("Are you expecting Boy or girl");
		String baby =scan.next();
		
	
		if(baby.equalsIgnoreCase("girl")) {
			
			System.out.println("Suggested baby name: " + momName.substring(0,momName.length()/2)+ dadName.substring(dadName.length()/2));
			
			
		}else {
																			 //it will exclude last three index since are divided by 2
			System.out.println("Suggested baby name: " + dadName.substring(0,dadName.length()/2)+ momName.substring(momName.length()/2));
			
		}
		
		
		
		

	}

}
