package practiceTask;

public class ArrayTaskLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * From an array of integer elements find the largest number.
		 */
		
		int[] num = {10,90,60,80,-800,60};
		//int largestNum=0; // inteased of this we type the beolw code line 14
		int largestNum=num[0]; // we are  assuming that the largest number is first elements of the array.
	
		for(int i=1 ; i<num.length; i++) { /*note we are start it with index[1]because , we already assumed num[0] is the largest number , so we taking num[0] 
											elements which is 10 and compare the other elements. */
		if(num[i]>largestNum) {
			largestNum=num[i]; //in here reassign the largest value
			}
	}
		System.out.println("The largest num among the array elements is " + largestNum + "!");
		
		System.out.println("------------------------------Enhance loop-----------------------------------");
		
		largestNum=num[0]; // basically we  reset the 
		
		for(int n:num) {
			
			if(n>largestNum) {
				
				largestNum=n; //basically we are storing each elements in largestNum
				
			}
			
		}
		System.out.println(largestNum);
}
}
