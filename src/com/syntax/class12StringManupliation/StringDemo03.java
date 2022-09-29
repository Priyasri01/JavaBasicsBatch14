package com.syntax.class12StringManupliation;

public class StringDemo03 {

	public static void main(String[] args) {
		
		String str=" i love java ";
		System.out.println(str);
		
		/*
		 * this "trim method" remove the spaces before and after the string 
		 * but not the one which are present in between
		 */
		System.out.println(str.trim());
		/*
		 * StartsWith=> check is a string starts with a specific letter or word
		 * endWith=>check is a string ends with a specific letter or word
		 * Contains=> check is a string Contains with a specific letter or word
		 */
		String str2="Java is Very easy";
		System.out.println(str2.startsWith("Java"));
		System.out.println(str2.endsWith("y"));
		System.out.println(str2.contains("very"));
		
		/*
		 * Method chaining helps us call multiple method on single line one method after an other
		 */
		
		System.out.println(str2.toLowerCase().contains("very"));
		

	}

}
