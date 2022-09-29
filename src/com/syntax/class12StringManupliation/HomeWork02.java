package com.syntax.class12StringManupliation;

public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever */

        String str = "This is sentence i want to reverse";

        String[] arr= str.split("");

     //System.out.println(Arrays.toString(arr));

     for(int i= arr.length-1 ;i>=0; i--){

         for(int j=arr[i].length()-1; j>=0; j--) {

             System.out.print(arr[i].charAt(j)+ " ");

         }
     }
	}
}


