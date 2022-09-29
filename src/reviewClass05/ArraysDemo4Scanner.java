package reviewClass05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo4Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("how many dresses do you have ");
        int size=scanner.nextInt(); //number of dresses
        double [] prices=new double [size]; 

        for (int i=0; i<size; i++) { // in here we can't use enhance loop , because we are asking compiler to add a value for each index in line item 18.
            System.out.println("Please enter the price of dress numnber"+(i+1));
            prices[i]=scanner.nextDouble(); 
        }


        System.out.println(Arrays.toString(prices)); // it will prints the array of all the elements  and this will work only for array not for single elements.

        double sum=0; 
        
      //limitations of enhanced loop
      //we can only go in one direction
      //we can't skip the elements
      //we can't use enhanced for loop to update the elements in an array
      // we can only use it to access the elements
        
        for (double price:prices) {
            sum+=price;
        }

        System.out.println("total for all the dresses ="+ sum);

	}

}
