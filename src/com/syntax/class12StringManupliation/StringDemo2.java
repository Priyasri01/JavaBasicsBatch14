package com.syntax.class12StringManupliation;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName="Olena";
		String lastName="Dudka";
		System.out.println(firstName+lastName); //Mostly this is used
		System.out.println(firstName.concat(" ").concat(lastName)); //this method will do concadiation.
		
		/*
		 * isEmpty() returns true if a string is empty. And even if u add space it count so it will return false on line 14.
		 * isBlank() method will not count spaces . even if u put have space between " " still it will provide false.
		 */
		String str =" ";
		System.out.println(str.isEmpty());
		//System.out.println(str.isBlank()); // this will give erro on version 8 becasue  this method was started at java 11.
		
		

	}

}
