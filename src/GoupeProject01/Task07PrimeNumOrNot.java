package GoupeProject01;

import java.util.Scanner;

public class Task07PrimeNumOrNot {

	public static void main(String[] args) {
		/*
		 *  Write a java program to check whether a given number is prime or not?
		 */
		
		
		/* note: we need to check two condition to confirm a given number is prime or not ,
		one is the given number suppose to greater than one and  the number need to have only 2 factors 1 and itself */
		
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter any number to check weather it's prime number or not?");
		int num= input.nextInt(); 
		int count=0; /* this variable is created to check how many factors are there in a particular number given by user. 
					As we know the prime number  rule is, number should  have only two factors they are 1 and number itself*/
		
		if(num>1) { // checking the first condition, given number is greater than or not.
			
			for(int i=2;i<num;i++) { // note: started with 2 because we know all the number can divided by 1 , to avoid iteration i started with 2 . instead of this we can follow simple code in calss 11
				
				if(num%i==0) { // Basically , we using this condition  to  checking how many factors are getting for the particular given number.
					count++;  //count+1 --> 0+1
				}
			}
			if(count==2) { //as we know prime will have only 2 factor 1 & number divided by itself , so if this condition is true then in will enter inside the if condition.
				
				System.out.println("selected number is " + num + " and it's prime number !");
			}else {
				
				System.out.println("selected number is " + num + " and is not prime number !");
			}
			
			
		}else {
			
			System.out.println("This is not prime number");
		}
		

	}

}
