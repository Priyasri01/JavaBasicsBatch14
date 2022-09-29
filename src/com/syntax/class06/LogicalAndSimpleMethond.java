package com.syntax.class06;

public class LogicalAndSimpleMethond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find the largest number and then find if the largest # is even or odd
		int num1=10;
		int num2=10;
		int num3=10;
		
		int largest =0; //we assign a variable name for int data type , so that we can call this where want.

	if(num1>num2 && num1>num3) {
		largest=num1;
	}else if(num2>num1 && num2>num3) {
		largest=num2;
	}else if(num3>num1 && num3>num2) {
		largest=num3;
	}
	System.out.println(largest+ " is the largest number");
	
	if(largest!=0) { /* the reason we are give this != condition is because their won't any large
					all will be zero , so only if larger than 0 then it will go to inner condition */
		
	if(largest%2==0) {
		
		System.out.println(largest+ " is even number");
	
	}else {
		System.out.println(largest+ " is odd number");
		
	}
	}else {
		
		System.out.println(" all the number's are equal");
	}
	}

}
