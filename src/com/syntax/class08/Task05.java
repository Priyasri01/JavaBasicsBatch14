package com.syntax.class08;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of that item. 
		 * Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		 * If user give more money program should return a change. 
		 * Whenever user done with payments program should say "Thank you for shopping!"
		 *
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter what u want to buy");
		String buy=in .next();
		
		System.out.println("what is the price of " + buy);
		double buyingPrice= in. nextInt();
		System.out.println("please pay for the " + buy);
		double userMoney;
		double extraMoney=0.0;
		double lessMoney;
		double total=0;
		
		do {
			  
			userMoney= in.nextDouble(); /*note if u put this outside of the do while  , you won't get the correct result , 
										because when user enter the value we have to accumulate */
			 total+=userMoney; 			//accumulate all money
			if(total<buyingPrice) {
				lessMoney=buyingPrice -total;
				System.out.println("you give less amout , please give balance" + lessMoney);
				}else if(total>buyingPrice) {
					extraMoney=total-buyingPrice;
					System.out.println("you give extra amount, please have balnce " + extraMoney);
					break;
					}
			}while(total!=buyingPrice);
		
		System.out.println("Thank You for Shopping");
		
		

	}

}
