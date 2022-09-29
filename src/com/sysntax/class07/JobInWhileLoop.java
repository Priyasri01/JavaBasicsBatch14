package com.sysntax.class07;

import java.util.Scanner;

public class JobInWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String answer;
		
		System.out.println("Did you get a job?");
		 answer=in.next();
		 
		 while(!answer.equalsIgnoreCase("yes")) {
				System.out.println("Did you get a job?");
				 answer=in.next();
		}
         System.out.println("congrats!");
	}

}
