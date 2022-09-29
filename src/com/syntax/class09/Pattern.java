package com.syntax.class09;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1 ; i<=4 ; i++) { //control iteration 
			for(int j=1; j<=4 ; j++) { // control value
				
				System.out.print("*");
				
			}
			System.out.println();
			
			
		}
		
		for (int a=0; a<=4; a++) {
            char sign='*';
            for (int b=1; b<=a+1; b++) {
                System.out.print(sign);
            } System.out.println();
        }
	}

}
