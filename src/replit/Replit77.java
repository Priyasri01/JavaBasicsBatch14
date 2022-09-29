package replit;

import java.util.Scanner;

public class Replit77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create an array of integers that will store 5 elements taken from a user
		 * Don't print any prompt message for the user
		 * Then print out all the elements you have created in the first loop in reverse order.
		 */
		
		Scanner scan = new Scanner (System.in);
	    int[] num = new int[5];
	  

	    for(int i=0; i< num.length; i++){

	      System.out.println("Please enter " + (i+1) + "number");
	      num[i] = scan .nextInt();

	      
	    }
	    
	 for(int i = num .length-1; i>=0 ; i--){

	      System.out.println(num[i]);

	}

}
}
