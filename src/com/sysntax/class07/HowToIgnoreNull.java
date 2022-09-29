package com.sysntax.class07;

import java.util.Scanner;

public class HowToIgnoreNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your country");
		String country= input .nextLine();
		String language=null;
		
		switch(country.toLowerCase()) { // in here we are checking variable
		case "india": //in here we are checking inside the country variable , what is the value
			language="Hindi";
			break;
			
		case "canada": /*NOTE if we are converting user input from upper case to lower 
						case make sure all the inside value suppose to be lower case then only .toLowerCase will work*/
			language="French";
			break;
			
		case "usa":
			language="English";
			break;
			
		case "brazil":
			language="Portuguese";
			break;
			
		default:
			language="Invalid";
			break;
		
		}
		System.out.println(" your are from " + country + " and your native language is "+ language);

	}


	}


