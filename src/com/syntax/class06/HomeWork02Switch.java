package com.syntax.class06;

import java.util.Scanner;

public class HomeWork02Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 *  A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		 *   At the end your program should print which grade was entered by a user with explanation.
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your grade");
		//char user = in .next(); //NEED TO KNOW HOW TO Char after.next()
		String user = in.next();
		String grade=null;
		
		switch(user){
			case "A":
			grade="Excellent";
			break;
			
			case "B":
			grade="Good";
			break;
			
			case "C":
			grade="Average";
			break;
			
			case "D":
			grade = "Bad";
			break;
			
			default:

			System.out.println("Not Acceptale, pelase enter the correct grade");
			break;
			
		}
		System.out.println("you entered " + user + " and your grade is " + grade + "!");
			
			
			
			
		}
		

	}

