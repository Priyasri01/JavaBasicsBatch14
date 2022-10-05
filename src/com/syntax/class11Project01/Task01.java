package com.syntax.class11Project01;

public class Task01 {

	public static void main(String[] args) {
		/*
         * Using Scanner create an array of integer values. After the array is created,
         * calculate the sum of all stored elements in that array.
         */
		
		int[] arr= {10,20,30,40};
		
		int sum=0;
		
		for(int i =0; i<arr.length; i++) {
			
			sum+=arr[i];
			
			}
		
		
		System.out.println("Sum of all stored elements in this array are " + sum);

		

	}

}
