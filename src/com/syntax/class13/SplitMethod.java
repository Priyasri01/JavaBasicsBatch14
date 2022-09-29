package com.syntax.class13;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//the split method will split the word by word by using array.
		
		  	String str="Batch 14 is really good";
		  	String [] arr=str.split(" "); // this spilt take regular expression. 
	        System.out.println(Arrays.toString(arr)); // this is just to see how the array input looks like.
	        System.out.println(arr[4]); // note since we split  with " ". each word is in individual index. ex: "Btach"  is in Index 0 and "14" is in Index 1
 
	        String str2="Today is Sunday. Sunday is good. Java is also good";
	        String[] arr2=str2.split("[.]"); // in here they are splitting  it with  dots. and also see we are using square bracket,because for the regular expression we will use square Brackets[].
	        System.out.println(Arrays.toString(arr2)); 
	        System.out.println(arr2[1]);
	        
	        
	        String str3="Today is Sunday";
	        String[] arr3 =str3.split("[d]"); // note we can pass want ever we what to slipt . in here i am split the array  from d.
	        System.out.println(Arrays.toString(arr3));
	        System.out.println(arr3[1]);
	        

	    }

	}



