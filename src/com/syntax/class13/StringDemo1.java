package com.syntax.class13;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {
		//substring method.
		
		String str="Today is Sunday";
		String day=str.substring(9); /*this method will give work based on the index...
		so if we say 9 then it will give the output starting from index 9 until end.*/
		System.out.println(str.substring(6,8)); // in this method we asking to give value form index 6 which is includes , and end index will be excluded  
		System.out.println(day);
		char c= str.charAt(4); //in here calling the method charAt on str object.
		System.out.println(c);  // This method will return charter which is stored in index 4
		
		char [] charArr = str.toCharArray();
	System.out.println(Arrays.toString(charArr)); // this will give out separate charter . and this only used to print the value and  put in array.
	System.out.println(charArr); // as we know the charArr reference variable is char not string . but by the when we asked for print out it convert char to string.
	
	int index = str.indexOf("a"); // this will show  in which index is the letter "a" stored. note we mentioned int because the value comes in number.becase we asked for the index number.
	System.out.println(index); // this will return the Index number which is in "a" is stored.
	System.out.println(str.indexOf("a", 6)); // if we need to find is their any other index in a string  which carry  "a" . beside the first occurrence.
	
	}
	

}
