package com.syntax.class12StringManupliation;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not empty perform the following: 
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
		 */
		
		String name="Priyasrii";
		int length= name.length();// note since  we are using same method again and again on line 14 so  we  created this reference variable 
		 // first request, is the string is empty or not 
		if(!name.isEmpty() && length%2!=0 && length>=3) { 
			//note line 15 & 16 is also correct , but it's different  and longer way of approach.
			//char[]charArray=name.toCharArray(); // this will convert the string to array
			//int length=charArray.length/2; // Create new length variable to have middle point, basically  this will have mid elements and mid index
			 int middleIndex =length/2; // we are using /2 because our request is we middle letters.
			System.out.println("The middle letter on my " +name + " is :" + name.charAt(middleIndex)); /*basically i called two method one inside another name.charAt()is one method inside this i called one more method which is .length
			 												if i live it empty then it will give error i have to specify which index elements u need it , since i don't know the size so i type string name.length/2 */
			
	}else {
			
			System.out.println("There is no middle charter");
		}
		
		 
		

	}

}
