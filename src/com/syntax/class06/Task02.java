package com.syntax.class06;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
	if the average score >=90 → grade=A
	if the average score >= 70 and <90 → grade=B
	if the average score>=50 and <70 → grade=C
	if the average score<50 → grade=F
		 * 
		 */
		int quiz= 100;
		int midTerm =90;
		int fin=95;
		String grade=null;
		
		int averageScore=(quiz +midTerm+ fin)/3;
		
		if(averageScore>=90) {
			grade="A";
		}else if(averageScore>=70 && averageScore<90) {
			grade="B";
		}else if(averageScore>=50 && averageScore<70) {
			grade="C";
		}else if(averageScore<50 && averageScore>0 ) {
			grade="F";
		}else {
			
			System.out.println("Please enter valid Score");
			grade="Invaild";
		}
		System.out.println( " your grade " + grade);

	}

}
