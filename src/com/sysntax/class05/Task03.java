package com.sysntax.class05;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ask user to enter a number and then define if number is small, medium or large
		Small number is value between 1 and 10
		Medium number is value between 11 and 100
		Large number is value between 101 and 1000
		*/
		
		Scanner input =new Scanner (System.in);
		System.out.println("please enter the number from 1 to 1000");
		
		double num= input .nextDouble();
		
		if(num>=1 && num<=10) {
			
			System.out.println("you enter small value");
			
		}else if(num>=11 && num<=100) {
			System.out.println("you enter medium value");
			
		}else if(num>=101 && num<=1000) {
			System.out.println("you enter Large value");
		}
		
			
			
		

	}

}
