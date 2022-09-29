package com.syntax.class06;

import java.util.Scanner;

public class HomeWork02IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 *  A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		 *   At the end your program should print which grade was entered by a user with explanation.
		 */
Scanner in= new Scanner(System.in);
System.out.println("Please enter your grade");
String  user=  in .next();
String grade;


if(user.equalsIgnoreCase("A")) {
	grade="Excellent";
}else if(user.equalsIgnoreCase("B")) {
	grade="Good";
}else if(user.equalsIgnoreCase("C")) {
	grade="Average";
}else if(user.equalsIgnoreCase("D")) {
	grade="Bad";
}else {
	grade="Not Acceptable";
}
System.out.println("you entered " + user + " and your grade is " + grade + "!");

	}

}
