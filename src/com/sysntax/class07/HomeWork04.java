package com.sysntax.class07;

public class HomeWork04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print odd numbers between 20 and 50 (2 ways)
		
		for(int i=21;i<=50; i+=2) {
			System.out.print(i+ " ");
			}
		System.out.println();
		System.out.println("*****************IF cond inside for loop to find odd number********************************");

		for(int i=20;i<=50;i++) {
			if(!(i%2==0)) { // note : in here i was make if to check two cond first i%2==0 then reverse that condition by put != 
				System.out.print(i + " ");
				
			}
		}
	}

}
