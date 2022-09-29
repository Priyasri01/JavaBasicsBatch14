package com.syntax.class06;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//logical not will reverse the condition.
		
		boolean boo= !true;
		System.out.println(boo); // result false
		
		boolean boo1= !false;
		System.out.println(boo); // result true
		
		boolean rain= true;
		
		if(!rain) {
		
		System.out.println(" i will go for walk"); // result true
		}
		String day="Monday";
		if(!day.equals("Sunday")) { //not operator always comes in the begining of the condition for boolean , string and char  and for number value it will come !=10
			System.out.println(" today is not sunday");
			}
		System.out.println("--------------------------------------------");
	
	boolean checkBoxSelected=true;
	
	if(!checkBoxSelected) { // in real life senario we will use this != for the check box and buttons on website
		
		System.out.println("I will clik and select it");
	}
		
		System.out.println("end of the progam");

}
}