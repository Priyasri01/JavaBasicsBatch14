package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * we need to ask a user where is he/she is from based on the country --> define favorite food,
 */
	Scanner in =new Scanner(System.in);
	System.out.println("Please tell me where are from?");
	String country= in .nextLine();
	String favoriteFood;
	
	switch(country) { // in here we are checking the country input since it's string the case also to be string
	case "USA":
		favoriteFood="Burger & freis";
		break;
	case "India":
		favoriteFood="Rice & curry";
		break;
	case "Yemen":
		favoriteFood="Mandi";
		break;
	case "Turkey":
		favoriteFood="adana kebab";
		break;
	case "Afghanistan":
		favoriteFood="palow";
		break;
		
	default:
		favoriteFood="palow";
		break;
		
	}
	System.out.println("your are from " + country + " and your favorite food is " + favoriteFood);
	
	}

}
