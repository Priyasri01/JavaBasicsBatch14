package com.sysntax.class07;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print even numbers from 20 to 100 
		
		int num =20;
		
		while(num<=100) {
			System.out.print(num + " ");
			num+=2;

	}
		
		System.out.print("********Another way ********************");
		
int num2=20;
		
		while(num2<=100) {
			
			if(num2%2==0) {
				System.out.println(num2);
			}
			num2++;
		}

}
}
