package com.sysntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl + space to complete the sentence 
		
		// find the largest number and then find if the largest # is even or odd
		boolean underStandJava=true;
		boolean enjoyJava= true;
		boolean practice=true;
		
		if(underStandJava && enjoyJava && practice) {
			
			System.out.println(" This is awesome ");
		}
			System.out.println("another example");
		
		int n1=100;
		int n2=200;
		int n3=300;
		
		if(n1>n2 && n1>n3) {
			System.out.println(n1 + " is the largest");
			
			if(n1%2==0) {
				
				System.out.println(n1 + " is even");
			}else {
				System.out.println(n1 + " is even");
				
			}
			
		}else if(n2>n1 && n2>n3) {
			System.out.println(n2 + " is the largest");
			
			if(n1%2==0) {
				
				System.out.println(n2 + " is even");
			}else {
				System.out.println(n2 + " is even");
				}
			
		} else if(n3>n2 && n3>n1) {
			System.out.println(n3 + " is the largest");
			if(n1%2==0) {
				
				System.out.println(n3 + " is even");
			}else {
				System.out.println(n3 + " is even");
				
			}
		}
		}
}
