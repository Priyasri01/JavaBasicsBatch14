package replit;

public class ReplitArray74 {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array of integers of size 11. 
		 * Add the years 2010 to 2020 to your array one by one using a for loop and then print all those values.
		 */
		
		int[] num= new int [11]; // created an array for size 11
	    int year=2010;

	    for(int i =0; i<num.length; i++){
	      
	      System.out.println(year);
	       year++; // asked compiler to increase year value by 1 at each iteration. first iter : year =year+1 -->2010+1 =2011 . second iteration year + 1 = 2011+1 = 2012 and so on..

	}

}
}
