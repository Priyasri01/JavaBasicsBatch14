package com.syntax.class08;

public class FindSumEvenAndOddForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//From the range of 1 to 50 
		//please find the sum of all even and all odd number.
		int sumOdd=0;
		int sumEven=0;
		for(int i=1 ; i<=50 ; i++) {
			if(i%2==0) {
				sumEven+=i; //sumEven= sumEven + i , which is sumEven=0+1 
			}else {
				sumOdd+=i;
				
			}
			
			}
		System.out.println("sum of even number from  1to 50 is " + sumEven);
		System.out.println("Sum of odd number from 1 to 50 is " + sumOdd);
		
}
}

	

