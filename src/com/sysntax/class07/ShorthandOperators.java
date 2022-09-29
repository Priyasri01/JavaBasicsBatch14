package com.sysntax.class07;

public class ShorthandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;
		i=i+9;
		System.out.println(i);
		
		i=i-5;
		System.out.println(i);
		
		i=i*2;
		System.out.println(i);
		
		int a=10;
		
		a+=9; //it's  shorter way of right it  , it basically a= a+9 which is a=10+9
		
		System.out.println(a);
		
		a-=5;
		System.out.println(a);
		
		a*=2;
		System.out.println(a);
		
		a-=10;
		System.out.println(a);
		
		a%=4; // a= a%4 -> 8%4 -> value is 2
		
		System.out.println("value after the mod opertion=" + a); //2
		
		a*=10;
		
		System.out.println(a);
		
	
	}

}
