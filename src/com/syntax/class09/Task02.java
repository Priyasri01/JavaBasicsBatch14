package com.syntax.class09;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create an array of names and store all names of your group. 
		 * Then print your name from that array. 
		 * (use 2 different ways of creating an array).
		 * 
		 * 
		 */

		String [] name= new String[5];
		name[0]="priya";
		name[1]="veera";
		name[2]="Rose";
		name[3]="peter";
		name[4]="Ram";
		
		System.out.println(name[0]);
		
		System.out.println("****************************************************");
		
		String [] name1= {"priya", "Kenny","nergis","Athria" , "Vidya","Humar"};
		System.out.println(name1[0]);
	}

}
