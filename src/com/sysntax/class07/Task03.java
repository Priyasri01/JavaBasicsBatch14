package com.sysntax.class07;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print only odd numbers from 100 to 1
		//(2 different ways)
		
		int num=99;
		while(num>=1) {
			
			System.out.print(num + " ");
			num-=2;
		}
		System.out.println();
		
		System.out.println("**************Another way if ******************************************");
		
		int num2=100;
		
		while(num2>=1) {
			if(num2%2!=0) {
				System.out.print(num2 + " ");
				}
			num2--;
		}
}

}
