package GoupeProject01;

public class Task03TwoDArraySumOfInt {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integer values. Print the sum of
			all numbers.

		 */
		
		int[][] num= {
						{20,30,40},
						{10,50,60}
					  };
		int sum=0;
		for(int i=0 ; i<num.length; i++) { // loop over the row/array
			
			for(int j=0 ;j<num[i].length; j++) { //inner loop iterate column of elements  of that particular array/row
				
				sum+=num[i][j];
			}
			
			
		}
		System.out.println("sum of all number are " + sum);
		
		System.out.println("************enhance for loop**************");
		
		 sum =0;
		 
		 for(int[] number:num) {
			 
			 for(int total :number) {
				 
				 sum+=total;
			 }
			 
		 }
		 
		 
		System.out.println(sum);
	}

}
