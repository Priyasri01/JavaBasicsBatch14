package com.sysntax.class07;

import java.util.Scanner;

public class HomeWork05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prompt the user to ask the name 3 times and print "Good afternoon +name...
		
	/* provide the default value null , because if i assign variable  in the begining  than i
	                  can call the variable inside the (loop, if cond and so on)and assign vale where ever i want it*/
		String name=null; 
		Scanner in = new Scanner(System.in);
		for(int i=1 ; i<=3 ; i++) {
			
			//Scanner in = new Scanner(System.in); --- we don't need to put the scanner inside , becuase we don't need three scanner one scanner will do all the job.
			System.out.println("please enter your name");
			name= in .nextLine();
			
		}
        System.out.println("Goodafternoon " + name);
	}
//	but the Question  asked 3 times name and we need the output for one time right?
}
