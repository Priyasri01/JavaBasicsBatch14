package com.syntax.class12StringManupliation;

public class StringDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Shah";
		//equals method will check  if two strings are exactly the same meaning same case.
		if(str.equals("shah")) {
			
			System.out.println("I fount it");
			
			
		
	}
		//equalsIgnoreCase method checks if two Strings content/value  are exactly the same but does not care about the case of letters.
		if(str.equalsIgnoreCase("shah")) {
			
			System.out.println("I fount it with equalsIgnoreCase");
		}
	
		}

}
