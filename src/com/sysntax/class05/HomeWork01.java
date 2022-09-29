package com.sysntax.class05;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. Write a program that will ask user to input inputs the current time (use 24 hour format).
			Based on the given time define:
				if hour is between 1-11 --> Morning
				if hour between 12-15 --> Afternoon
				if hour between 16-20 --> Evening
				if hour between 21-24 --> Night */
		
		Scanner input = new Scanner(System.in);
		System.out.println("pelase enter any number between 1 to 24");
		int time= input .nextInt();
		
		if(time>=1 && time<=11) { /*note : you can't put or/|| in here because if one condition is true the whole "if block of code" will execute . 
									ex: time<=1 || time>=11 then if the user input 12 for right condition & 24 on left condition  . 12>=1 it true  or 24<=11 is fall.
									first condition is true .so it will execute morning. even it's not right . So instead of || we have to put && */
			System.out.println("Morning");
		}else if(time>=12 && time<=15) {
			System.out.println("Afternoon");
		}else if(time>=16 && time<=20) {
			System.out.println("Evening");
		}else if(time>=21 && time<=24) {
			System.out.println("Night");
		}else {
			
			System.out.println("Invalid value");
		}
		
	}

}
