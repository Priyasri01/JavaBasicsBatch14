package com.sysntax.class07;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print all number from 1 to 10;
		
		int num=1;
		
		while(num<=10) {
			
			System.out.println(num + " ");
			num++;
		}
		System.out.print("***********************");
		
	// print all number from 10 to 25
		
		int a=10;
		
		while(a<=25) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println("***********************");
		//print all number from 10 to 1;
		int b=10;
		while(b>=1) {
			System.out.print(b + " ");
			b--;
		}
		System.out.println("***********************");
		
		//print all number from 50 to 20
		
		int c= 50;
		while(c>=20) {
			System.out.print(c + " ");
			c--;
			
		}
		System.out.println("***********************");
		//print all even number from 1 to 20
		int d=2;
		
		while(d<=20) {
			System.out.print(d + " ");
			d+=2;
			
			}
		
		System.out.println("***********************");
		
		//print all even number from 1 to 20
		
		int e=1;
		while(e<=20) {
			if(e%2==0) {
				System.out.print(e+ " ");
				}
			e++;
			
			}
		System.out.println("***********************");
		int f=1;
		while(f<=20 && f%2==0) {
			System.out.print(f+ " ");
			f++;
			
			}
		System.out.println("*********see below example what will happen if g++ inside the if **************");
		int g=1;
		while(g<=20) {
			if(g%2==0) {
				System.out.print(e+ " ");
				//g++; // if we put this increment inside the if condtion  then it will run while loop infinate
				}
			g++;
			System.out.print("i am inside the loop"); 
			}
		
		
	}

}
