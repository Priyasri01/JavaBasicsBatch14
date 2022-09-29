package GoupeProject01;

public class Task05TwoDArraySumOddEven {

	public static void main(String[] args) {
		/*
		 *  Create a 2D array of integers. Develop a program
			which will calculate the sum of even and odd numbers
			for that array. */
		
		int[][] num= {{13, 20, 67},
					  {1,2,5},
					  {40,37,91}};
		int sumOfOddNum=0;
		int sumOfEvenNum=0;
		
		for(int i=0; i<num.length; i++) {
			
			for(int j=0 ; j<num[i].length; j++) {
				
				if(num[i][j]%2==0) {
					
					sumOfEvenNum+=num[i][j];
				}else if(num[i][j]%2!=0) {
					
					sumOfOddNum+=num[i][j];
					
				}
			}
		}

		System.out.println("Sum of the Even Number in 2D Array are: " + sumOfEvenNum + "!");
		System.out.println("Sum of the odd Number in 2D Array are: " + sumOfOddNum + "!");
	}

}
