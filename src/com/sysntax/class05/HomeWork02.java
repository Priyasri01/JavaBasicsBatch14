package com.sysntax.class05;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Write a program for user to enter his/hers birth month. Based on the month define the season.
		Example: if user is born in March, April, May → season =”Spring” 
		if user is born in June, July, August → 
		season =”Summer”  etc …*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("pleas enter your brith month");
		
		String month =input .next();
		
		if(month.equalsIgnoreCase("March")|| month.equalsIgnoreCase("April")|| month.equalsIgnoreCase("May")){
			
			System.out.println("You born on Spring Season!");
			
		}else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")|| month.equalsIgnoreCase("August")) {
			
			System.out.println("You born on Summer Season!");
			
		}else if(month.equalsIgnoreCase("September")||month.equalsIgnoreCase("Octomber")|| month.equalsIgnoreCase("November")) {
			
			System.out.println("You born on Fall/Autumn Season!");
		}else if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")|| month.equalsIgnoreCase("February")) {
			
			System.out.println("You born on winter  Season!");
			
		}else {
			
			System.out.println("Invaild Month!");
		}
		
		
		
		

	}

}
