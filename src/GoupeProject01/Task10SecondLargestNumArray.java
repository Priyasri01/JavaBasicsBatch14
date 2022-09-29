package GoupeProject01;

public class Task10SecondLargestNumArray {

	public static void main(String[] args) {
		/*Write a java program to find the second largest
		number in the array? */
		
		
		//created an  Array "num" hold the number
		int[] num= {60,70,100,50};
		
		//Create 2 variable to hold largest and 2nd largest values.
		int largestNum=num[0];
		int secondLargestNum=num[0];
		
		
		for(int i=0; i<num.length ; i++) { //since we have to check all the elements  , we are doing iteration.
			
			if(num[i]>largestNum) {
				secondLargestNum=largestNum;
				largestNum=num[i];
				
			}else if(num[i]>secondLargestNum) {
				
				secondLargestNum=num[i];
			}
			
		}
		
		System.out.println(" The second largest Numeber is " + secondLargestNum);
		
		
		


	}

}
