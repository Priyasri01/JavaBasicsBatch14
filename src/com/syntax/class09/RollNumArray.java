package com.syntax.class09;

public class RollNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//store 5 roll numbers
		
	
		int[] rnos= new int[5]; // Is data type basically represent what is type of data store inside the array.
		
		//int[] rnos= new int[5]; // int[]-->data type , rnos --> is refer variable & after = creating the object in heap memory . BEFORE  = IS COMPILER TIME & AFTER = IS RUNTIME
		
		//or we can directly like below
		//all the date inside the array need to be same data type out of bounds
		
		int[]rnos1= {23,15,45,32,15};
		
		int[] ros; // this is know as declaration of array. ros is getting defined in the stack
		 ros =new int[5];//  Initialization actually here object is being created in the memory(Heap)
		
		
		System.out.println(rnos1[4]);
		

	}

}
