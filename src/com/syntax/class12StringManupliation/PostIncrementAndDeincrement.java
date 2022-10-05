package com.syntax.class12StringManupliation;

import java.util.Arrays;

public class PostIncrementAndDeincrement {

	public static void main(String[] args) {
		

		int a=10;
	     
	     int b= a-- + 4; //it's post increment . so will keep the original value in the statement.
	     System.out.println(a + " b value is " + b); // i=9 ; j=10+4 (orginal value + j value)-->14
     
	     
	     int i=10;
     
     int j= --i + 4; //it's pre increment . so will keep the  new value in the statement.
     System.out.println(i + " j value is " + j); // i=9 ; j=9+4 (new value + j value)-->13
     

     
	}
}


