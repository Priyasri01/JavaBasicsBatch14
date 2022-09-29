                                                                                                                        package com.syntax.class12StringManupliation;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/*Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
		 * 
		 */

		
		String userName;
		String password;
		
		String confirmPassword;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter the user name");
			userName= scan.next();
		System.out.println("Please enter password");
		   password= scan.next();
		 System.out.println("Please enter the password Again");
		 confirmPassword= scan.next();
		   
		
		
		
		if(userName.isEmpty()|| password.isEmpty()) { // if we put && and will 
			System.out.println("username and pasword cannot be empty");
		}else if(password.length()<8) {  //since we have to check  multiple condition before out put  we are using if, else if condition 
			System.out.println("Password is too short");
		}else if(password.contains(userName)) {
			System.out.println("Password cannot contain username ");
		}else if(!password.equals(confirmPassword)) {
			System.out.println("password don't match");
		}else {
			
			System.out.println("your username and password has been created");
		}
	}

}
