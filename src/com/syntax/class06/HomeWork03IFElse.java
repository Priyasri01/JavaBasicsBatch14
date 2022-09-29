package com.syntax.class06;

import java.util.Scanner;

public class HomeWork03IFElse {

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
		System.out.println("Please enter what operation would you like to do ADD, SUB,MUIL, OR DIV ");
	    String cal =in.next();
	    double div=0.0;
	    
	    
	    if(cal.equalsIgnoreCase("ADD")) {
	    	 System.out.println("you seleted addition , and value of "+ num1 + " & " + num2 + "is " + (num1 + num2));
	    }else if(cal.equalsIgnoreCase("sub")){
	    	System.out.println("you seleted subtraction , and value of "+ num1 + " & " + num2 + "is " + (num1 -num2));
	    }else if(cal.equalsIgnoreCase("muil")) {
	    	System.out.println("you seleted muiltiplication , and value of "+ num1 + " & " + num2 + "is " + (num1 * num2));
	    }else if(cal.equalsIgnoreCase("div")) {
	    	 div=num1/num2;
	    	System.out.println("you seleted division , and value of "+ num1 + " & " + num2 + "is " + div);
	    }else {
	    	
	    	System.out.println("Invalid input, please try it again");
	    }

	}

}
