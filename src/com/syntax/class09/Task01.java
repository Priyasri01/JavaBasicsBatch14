package com.syntax.class09;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B 
		 * (use 2 different ways of creating an array).
		 */
		
		char[] letter= new char[6];
		letter[0]='A';
		letter[1]='B';
		letter[2]='C';
		letter[3]='D';
		letter[3]='E';
		letter[3]='F';
		System.out.println(letter[1]);
		
		System.out.println("*************************");
		
		char[]grade = {'A','B','C','D','E','F'};
		System.out.println(grade[1]);
	}

}
