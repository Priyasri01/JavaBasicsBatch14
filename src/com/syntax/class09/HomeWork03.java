package com.syntax.class09;

public class HomeWork03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 3. Create an array on integers and calculate 
		 * the sum of all elements in an array 
		 */
		
					
		int[] num= {10, 30, 20, 50, 60}; //size 5
		int sum=0;
		for(int i=0; i<num.length; i++) { //i<5
			sum+=num[i]; // sum =sum + num[i] which is sum=0+10(first iteration) sum=0+30(secod itereation) sum=0+20(thrid iteration) and so on .. 
		
		}
		System.out.println(sum);
		System.out.println("------------------------------enhance loop-------------------------------------------------------");
		
		sum=0;
		for(int number : num) {
			
			sum+=number;
		}
		System.out.println(sum);
}
}