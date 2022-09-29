package com.sysntax.class07;

import java.util.Scanner;

public class DowhileExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * while loop is most popular when compare to do while
		 */
		
		Scanner in = new Scanner(System.in);
		String answer;
		do {
		System.out.println("Did you get a job?");
		 answer=in.next();
		
		}while(!answer.equalsIgnoreCase("yes"));
		
		System.out.println("Congrats!");

	}

}
