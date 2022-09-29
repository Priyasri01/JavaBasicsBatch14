package com.syntax.class11Project01;

import java.util.Scanner;

public class Task07PrimeNumOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter any number?");
		 int num = scan .nextInt();
	        boolean isPrime=true;
	        if (num > 1) {

	            for(int i=2;i<=num;i++) { // we can put either <=num or < num  . 
	            							
	                if(num%i==0) {
	                    isPrime=false;
	                 break;
	                }
	              
	            }
	        }else {
	            isPrime=false;
	        }

	        if(isPrime) {
	            System.out.println(num+" is Prime");
	        }else {

	            System.out.println(num+" is not Prime");
	        }

	    }

	}



