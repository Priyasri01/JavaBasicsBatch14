package com.syntax.class12StringManupliation;

public class Task03 {

	public static void main(String[] args) {
		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS).
		 */
		
		String name="Sunday";
		
		for(int i= name.length()-1 ;i>=0 ; i--) { //name.length() --->will provide size of the string.
			
			System.out.print(name.charAt(i)); //this .charAt() will give you the elements from the string for each iteration. ex: FI -->Y , SI-->a and so on...
		}
		System.out.println();
		System.out.println("**********************Another way************************************");
		
		char [] arr =name.toCharArray(); // in here we convert string to char then we do revers by using loop
		
for(int i=arr.length-1 ; i>=0 ; i--) {
	
	System.out.print(arr[i]); // since we converted string to char [] so we called arr[i].
	
}
	}

}
