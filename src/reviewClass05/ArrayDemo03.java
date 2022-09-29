package reviewClass05;

import java.util.Arrays;

public class ArrayDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creates an array store elements in the array 
        // then with help of another array adds all the elements.
        int size=10;
        int [] arr=new int[10];
        int start=11;
        for(int i=0; i<arr.length;i++) {

            arr[i]=start; //its telling compiler to store start value  in every single arr index
            start--; //it will 
        }

        System.out.println(Arrays.toString(arr)); // this is called build in method.
        System.out.println("**************************************************");
        int sum=0;
        for(int num:arr) {
            //sum+=num;
            sum=sum+num; /*so, the loop will run 10 times, adding to the sum each time giving you the total
             				sum of all the elements */
        }
        System.out.println(sum);

    }

	}


