package reviewClass05;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double size=10;
		int[] arr= new int[10];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i]=20; //its telling compiler to store 20 in every single index
		}

		System.out.println(Arrays.toString(arr)); // this basically will assign value for all i which is 20.
	}

}
