package com.syntax.class13;

public class ReplaceMethod {
	
	
	public static void main(String[] args) {
		
	    String str="szfksKAFBDAJKF114930!@#%$%$$";
	
	    

	    System.out.println(str.replaceAll("[0-9]","@")); //Replace all numbers from 0 to 9 with @

	  

	    System.out.println(str.replaceAll("[0-9]",""));   //Remove all numbers from 0 to 9 

	
	     
	    System.out.println(str.replaceAll("[a-z]",""));  // Remove all letters  from a to z refer the asci table for range info 
	    
	    System.out.println(str.replaceAll("[0-z]",""));  //Remove all letter and number from 0 to z small letter.

	    System.out.println(str.replaceAll("[A-Z]",""));    // Remove all letters  from A to Z refer the asci table for range info 

	

	    System.out.println(str.replaceAll("[^A-Z]",""));      //Remove all letters  other than A to Z refer the asci table for range info 

	     
	     
	    System.out.println(str.replaceAll("[^a-zA-Z]","")); // Remove all letters  other than A to Z and a to z refer  the asci table for range info 

	    
	    System.out.println(str.replaceAll("[^a-zA-Z0-9]","")); //Remove all letters  other than A to Z and a to z and 0 to 9  refer the asci table for range info 
}
}