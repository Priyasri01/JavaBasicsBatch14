package com.syntax.class06;

public class SwitchDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Matching case must be same data type as a variable
		//char don't have option for case-sensitive like how we have in string IgnoreCase
		//inside the switch case you can not have duplicate case

		char choice = 'p';
		String answer=null;
		
		switch(choice) { //
		
		case 'Y': //we need to have the same data type in as per the variable data type we assingned
			answer="yes";
			break;
		case 'N':
			answer="NO";
			break;
		case 'M':
			answer="Maybe";
			break;
		default:
			answer="unkonwn";
			break;

		}
		System.out.println(answer);
	}

}
