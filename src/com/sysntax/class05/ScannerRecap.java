package com.sysntax.class05;

import java.util.Scanner;

public class ScannerRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * wind: ctrl+shift+o  for import shortcut
		 */

		String str="Hello";
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your name");
		// to capture different values we need to use different options like for words we use string, for whole number byte, short, int and for charater char and  so ..on
		String name = input.next(); //capturing string
		System.out.println("pelase enter your age");
		int age=input.nextInt(); //capturing int
		System.out.println(name + " is " + age + " years old");
		
		System.out.println("How much money you have " + name);
		double money= input.nextDouble();
		System.out.println(name + "has $" + money);
		System.out.println(name + " what is your grade");
		char grade= input.next().charAt(0); /*first it will store it as  string value what ever we type on console ex:peter 
											because we are putting .next()and after that it take first charter from the word peter  .
											that why we are getting P it store in first index 0 */
		
			System.out.println(name+ " has grade " + grade);
			//	as to take the first Index by saying .charAt(0) 
			
		System.out.println("end");
		System.out.println("Please enter your another name");
		name=input.next(); // in here it capture new name and store on the same name variable in which we  assigned earlier on line 17 , so output we will get in line item 33 is raju. 
		System.out.println(name);
		
	}

}
