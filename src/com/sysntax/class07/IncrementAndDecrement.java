package com.sysntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=90;
		num=num+1;
		
		//note this increment & decrement  will work only when we assign value for variable 
		
		System.out.println(num); //91
		
		//another way to increment variable by 1-> ++
		
		num++; // meaning num =num+1  result 99+1 = 92
		System.out.println(num);
		
		num--; // meaning num =num+1  result 99+1 = 92
		System.out.println(num);
		
		int i=10; // 
		i--; // decrement by 1 which is i=i-1 -> i =10-1 result =9
		i--; // decrement by 1 which is i=i-1 result -> i=9-1 result  =8
		System.out.println(i); // the result will be 8 , because in line 22 & 23 we are decrement by 1
		
	}

}
