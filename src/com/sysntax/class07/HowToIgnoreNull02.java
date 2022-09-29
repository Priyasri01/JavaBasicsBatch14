package com.sysntax.class07;

import java.util.Scanner;

public class HowToIgnoreNull02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*
         * Ask user to enter their country and capture it. Once values are captured
         * print which language user speaks.
         */
		Scanner aaa = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        double num1 = aaa.nextInt();

        System.out.println("Enter 2nd Number");
        double num2 = aaa.nextInt();

        System.out.println("Enter the operator");
        String oper = aaa.nextLine();
        char op = aaa.next().charAt(0); // we getting the input in char

        double result = 0;
        boolean wrongOperator=false;

        if (op == '+') {
            result = num1 + num2;
        } else if (op == '-') {
            result = num1 - num2;
        } else if (op == '*') {
            result = num1 * num2;
        } else if (op == '/') {
            result = num1 / num2;
        } else {
            System.out.println("Enter valid operator");
            wrongOperator=true;
        }

        if (!wrongOperator) {
            System.out.println(result);
        }
   }

}
