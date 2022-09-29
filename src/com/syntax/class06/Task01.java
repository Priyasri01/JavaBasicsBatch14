package com.syntax.class06;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				/* Write a program for user to enter his/hers birth month. Based on the month define the season.
				Example: if user is born in March, April, May → season =”Spring” 
				if user is born in June, July, August → 
				season =”Summer”  etc …*/
				
				Scanner input = new Scanner(System.in);
				System.out.println("pleas enter your brith month");
				
				String month =input .next();
				String season=null;
				
				if(month.equalsIgnoreCase("March")|| month.equalsIgnoreCase("April")|| month.equalsIgnoreCase("May")){
					season="Spring";
				}else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")|| month.equalsIgnoreCase("August")) {
					season="Summer";
				}else if(month.equalsIgnoreCase("September")||month.equalsIgnoreCase("Octomber")|| month.equalsIgnoreCase("November")) {
					season="Fall";
				}else if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")|| month.equalsIgnoreCase("February")) {
					season="Winter";
				}else {
					System.out.println("Invaild Month!");
				}
				System.out.println("You born on "+ season + "!");
	}

}
