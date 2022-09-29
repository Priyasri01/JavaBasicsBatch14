package GoupeProject01;

public class Task11DuplicateNumArray {

	public static void main(String[] args) {
		/*Write a program to print out duplicate elements from
an Array of Int? */
		
		int[] num= {100,13,6,13,9};
		boolean flag=false; // we are creating boolean variable , suppose in case if we didn't find any duplicate value then we use this for if condition outer the iteration 
		
		// we need two loops , one to repeat complete array(which is outer loop) and  the other one is to compare elements with each other .
		for(int i =0; i<num.length; i++) { // taking one value for each iteration
			
			for(int j=i+1; j<num.length; j++) { /* note in here we given j=i+1 , in first iteration  we are taking first elements and started comparing 
												with all other elements,that's why we are doing i+1 , otherwise we can just say if we start i=0 , 
												then j suppose to start 0+1 which is j=0+1 for the comparison*/
			if(num[i]==num[j]) { //note: in first iteration we are taking the first value which is 100  and compare with all other elements(13,6,13,9)
				
				System.out.println("Found Dulicate value " + num[i]); // if we found the duplication value then all the code inside the if body will execute line 20 & 21)
			flag=true;
				/* the reason i am changing flag value to true. because we found the duplication on line 19.,
				so that if it's move to line item 30 , the condition won't be true , coz value of falg has been changed here to true(true==false) .
				so it won't go further inside the if condition.*/
			}
			}
				
			}
			
	if(flag==false) {
		/* in case if we didn't find any duplication out of the all iteration(above), 
							then this condition will be true because false==false , the inner code will be execute*/
			
			System.out.println("Duplicate elements not found ! ");
			
		}
		
	}
}


