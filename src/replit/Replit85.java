package replit;

public class Replit85 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that sums all numbers that are on even index and on even row.
		 */
		
		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
int sum=0;
    for(int i=0;i<a.length;i++){
      for(int j=0; j<a[i].length;j++){
     
    	  if((i%2==0)&&(j%2==0)){ /*this condition basically we are doing iteration for index number not
    	   							for  elements ex:index number [i] =0 first iteration 
    		  						and [j]=0 FI  ==>Condition true it will go inside ; [i]=0 SI & [j]=1 SI  ==>condition not true it won't go inside*/
    		  
    		  sum+=a[i][j]; //adding the elements from the particular index .
      }
      }
    }
		 System.out.println(sum);

		
	}
		
}
