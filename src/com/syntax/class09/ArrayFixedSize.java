package com.syntax.class09;

public class ArrayFixedSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= new int[3];
		
		nums[1]=12;
		nums[1]=13;
		
		System.out.println(nums[0]);
		
		String[] color= new String[3];
		color[0]="white";
		color[1]="pink";
		color[2]="black";
		color[3]="yello"; // will get run time error , Arry Index outof Bounds exception:3 
		
		
		//System.out.println(color[3]); will get run time error , but their won't be any compiler error the syntax are fine
		System.out.println(color[4]);
		
	}

}
