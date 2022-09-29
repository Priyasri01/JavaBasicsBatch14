package com.syntax.class10;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
								//[row][colu]	
		int[][] bigArray = new int[3][4]; // 
		
//note:always need to fill row by row, like below
		
 //1st row note
		bigArray [0][0]=10;
		bigArray [0][1]=20;
		bigArray [0][2]=30;
		bigArray [0][3]=40;
//2st row
		bigArray [1][0]=100;
		bigArray [1][1]=200;
		bigArray [1][2]=300;
		bigArray [1][3]=400;

//3st row
		bigArray [2][0]=1;
		bigArray [2][1]=2;
		bigArray [2][2]=3;
		bigArray [2][3]=4;	
		
		//how to access elements from 2D Array?
		
		System.out.println(bigArray[1][2]) ;
		
	}

}
