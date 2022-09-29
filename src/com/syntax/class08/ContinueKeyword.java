package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //continue - continues to the next iteration/cycle
        // moment Java sees continue -> it goes back to the beginning of the loop
        //it usually used inside some type of conditions
		
		for(int i=1; i<5; i++) {
			
			if(i==3) {
				continue; //means go back to the begining of the loop , continue to the next iteration 
			}
			System.out.println("Hello");
			System.out.println("How are you");
			System.out.println(i);
			}
		
// i want to print number from 1 to 20 expect number 3,7, & 8
		
		for(int i=1; i<=20 ; i++) {
			if(i==3 || i==7 || i==11) {
				continue;
				}
			System.out.print(i + " ");
		}
  }

}
