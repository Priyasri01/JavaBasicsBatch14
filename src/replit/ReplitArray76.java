package replit;

import java.util.Scanner;

public class ReplitArray76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
	    String[] dayOfWeek =new String[7];
	    String week=null;
	    for(int i =0; i<dayOfWeek.length; i++)
	      {
	        System.out.println(" please enter day " + (i+1) + " of the week");
	        dayOfWeek[i] =in .next();
	       
	        
	        /*System.out.println(dayOfWeek[i]); ---> note we can't put this line inside the for loop, 
	        									because output we need all elements in one short(sunday to saturday).
	        									But we put here for every iteration you will get the out put. 
	        									to avoid this we created separate enhance for loop(line 29) in which we can get all elements in one short.
	        									note : it can be either enhance/for loop doesn't matter*/
	        
	  }
	   
	    /*System.out.println(dayOfWeek[i]); this will give compiler error , 
	     * Because we are calling the "i" outside of the for loop. 
	     * so to retrieve all the data we have to use on more loop either for loop or enhance for loop
	     */

for(String day: dayOfWeek){

 System.out.println(day);
	}
	}

}
