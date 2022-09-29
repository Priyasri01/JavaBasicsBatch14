package com.sysntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day= "Saturday";
		
		if(day.equals("Saturday") || day.equals("sunday")) {
			
			System.out.println("I have java class at syntax - using logical OR");
			
		}
		System.out.println("----------------------------------------------");
		
		if(day.equals("Saturday") && day.equals("sunday")) {
			
			System.out.println("I have java class at syntax");
			
		}
		System.out.println("----------------------------------------------");
		
		double money= 40000;
		String title= "Sales Man";
		
		if(title.equals("Automation Tester") || money==120000) {
			
			System.out.println("Happy");
		}else {
			
			System.out.println("Salary is not enough, change the carrier ");
		}
		
	}

}
