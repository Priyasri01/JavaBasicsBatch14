package com.sysntax.class05;

public class NestIfDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nested if --> when one condition depends on another condition
		/* 
		 * to format  code use ctrl+shift+f for windows
		 * to format code use cmd+shift+f for mac
		 */

		boolean allergy = true;
		String allergyType = "Pollen";

		if (allergy) {
			System.out.println("let's check what allergy you have ");
			if (allergyType.equalsIgnoreCase("pollen")) {
				System.out.println("try to stay indoors when trees are  ");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("pelease stay away from peanut  ");
			} else if (allergyType.equals("Dairy")) {
				System.out.println("pelease stay away from dairy products ");
			} else {
				System.out.println("we need to do some test ");
			}
		} else {
			System.out.println("good you don't have any allergy ");
		}

	}

}
