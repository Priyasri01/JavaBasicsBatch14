package com.syntax.class08;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * create a screte number and let user guess the secret number once user gussed your secret number --> program says u won.
		 * 
		 */

		Scanner in  = new Scanner (System.in);
		//System.out.println("Please gusess my number");
		int num;
		int myNum=8;
		do {
			System.out.println("Please gusess my number from 1 to 100");
			num= in .nextInt();
			
		}while(myNum !=num);
		
		System.out.println("you won !");
}
}

