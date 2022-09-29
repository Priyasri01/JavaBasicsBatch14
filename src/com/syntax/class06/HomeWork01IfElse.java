package com.syntax.class06;

import java.util.Scanner;

public class HomeWork01IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 */
		
		Scanner input = new Scanner(System.in);
		System .out.println("Please enter your country");
		String country = input .nextLine(); //get the user value in string data type
		
		//String language=null;
		String language;
		
		if(country.equalsIgnoreCase("India")) {
			language="Hindi";
		}else if(country.equalsIgnoreCase("Canada")) {
			language="French";
		}else if(country.equalsIgnoreCase("USA")) {
			language="English";
	}else if(country.equalsIgnoreCase("Brazil")){
		language="Portuguese";
	}else {
		
		language="Invalid Country"; /*note since i assigned value for language variable , i don't provide the compiler default value on line 17.
									just assigned only variable name for string data type.*/
	}
	System.out.println("your are from " + country + " and your native language is " + language);
}
}
