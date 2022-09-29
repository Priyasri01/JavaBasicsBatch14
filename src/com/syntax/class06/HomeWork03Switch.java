package com.syntax.class06;

import java.util.Scanner;

public class HomeWork03Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user. 
		 * Please complete this assignment in 2 ways: using if statement and switch case.
		 * 
		 */
		
		Scanner in =new Scanner(System.in);
		System.out.println("please enter any two numbers");
		int num1= in .nextInt();
		int num2= in .nextInt();
		System.out.println("Please enter what operation");
	    String cal =in.next();
	    int add=0;
	    int sub=0;
	    int muil=0;
	    int div=0;
	    
	    
	    switch(cal) {
	    
	    case "+":
	    add =num1 + num2;
	    System.out.println("you seleted addition , and value of "+ num1 + " & " + num2 + " is " + add);
	    break;
	    
	    case "-":
	    //sub=num1 - num2;
		System.out.println("you seleted subtraction , and value of "+ num1 + " & " + num2 + " is " + (num1 -num2));
		break;
		
	    case "*":
		muil=num1 * num2;
	    System.out.println("you seleted muiltiplication , and value of "+ num1 + " & " + num2 + " is " + muil);
		break;
	    
	    case "/":
		div=num1 * num2;
		System.out.println("you seleted muiltiplication , and value of "+ num1 + " & " + num2 + "is " + div);
		break;
		
		default:
		System.out.println("Invalid input, please try it again");
		break;
	    }
	    
}

}
