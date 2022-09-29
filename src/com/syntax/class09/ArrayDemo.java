package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr =new int[4];
		
		arr[0]=10; //store elements inside an arry , but do we stored? we stored through index.
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		//accessing elements from the array
		System.out.println(arr[2]); //30
		System.out.println(arr[1] + arr[2]);
		
		//lets create an arry and store class mate name
		
		String [] name= new String[5];
		name[0]="priya";
		name[1]="veera";
		name[2]="Rose";
		name[3]="peter";
		name[4]="ppo";
		
		System.out.println("Hello " + name[1]);
		
	}

}
