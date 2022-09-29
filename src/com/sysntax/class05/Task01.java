package com.sysntax.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Prompt the user to enter person heights in inches. 
		 * Person should be classified as one of the following:
			• short (under 60 inch)
			• medium(between 60 -72 inch)
			• tall (over 72 inch)
		 */
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("please enter your height in Inch");
		int height= input .nextInt();
		
		if(height<60) {
			System.out.println("your are short");
		}else if(height>=60 && height<=72) {
			System.out.println("your are medium");
		}else if(height>72) {
			System.out.println("your are tall");
		}
		
		
	}

}
