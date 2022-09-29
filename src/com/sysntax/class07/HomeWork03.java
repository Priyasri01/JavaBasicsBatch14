package com.sysntax.class07;

public class HomeWork03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print even numbers from 20 to 1 (2 ways)
		
		for(int i=20 ; i>=1 ; i-=2) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("*****************IF cond inside for loop********************************");
		
		for(int i=20 ; i>=1; i--) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
	}

}
