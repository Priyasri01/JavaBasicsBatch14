package com.syntax.class06;

import java.util.Scanner;

public class EnhanceCoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("pelase enter any number between 1 to 24");
		int time= input .nextInt();
		String timeOfTheDay;
		
		if(time>=1 && time<=11) { 
			timeOfTheDay= "Morning";
		}else if(time>=12 && time<=15) {
			timeOfTheDay= "Morning";
		}else if(time>=16 && time<=20) {
			timeOfTheDay= "Morning";
		}else if(time>=21 && time<=24) {
			timeOfTheDay= "Morning";
		}else {
			System.out.println("Invalid value");
		timeOfTheDay="Invaild"; // note as a programmer we can assing the value otherwise just give a default value while we creating a variable on line 13
		}
		System.out.println(timeOfTheDay);
	}

}
