package com.syntax.class12StringManupliation;

public class HomeWork01 {

	public static void main(String[] args) {
		/*Create a String that will hold a sentence. Write a program to get a new String without any spaces.*/
		
		String name="peter rose water on the sand";
		
		String nameWithoutSpace = name.replaceAll(" ", "");
		
		System.out.println(nameWithoutSpace);
		
		

	}

}
