package com.syntax.class14;

public class ReturnMethdPrimeOrNot {

	
		// TODO Auto-generated method stub
		//Write a method to return whether given number is prime or not?

boolean isPrimOrNot(int num) {
	boolean isPrime=true;
	
	if(num>1) {
		
		if(num%2==0) {
			
			for(int i =2; i<num; i++) {
				
				isPrime=false;
			}
		}
		
		 
	}else {
		
		isPrime=false;
	}
	
	return isPrime;
}
public static void main(String[]args) {
	
	ReturnMethdPrimeOrNot mt= new ReturnMethdPrimeOrNot();
	
	if(mt.isPrimOrNot(20)) {
		System.out.println("it's prime number");
	}else {
		
		System.out.println("it's not prime number");
	}
}
}
