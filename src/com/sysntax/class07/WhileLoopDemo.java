package com.sysntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//loops always work  based on the condition
		
		int time= 10;

		if(time<12){

		System.out.println("good morning inside if statement");

		}

		/* this is infinite loop  & loop is block of code that will repeats until the condition true
		 * while(time<12){

		  System.out.println("good morning");
		}
		 */
		
		while(time<12){  

			  System.out.println("good morning inside the while loop");
			  time++;
			}
		
		System.out.println("**********************************************");
	}
	

}
