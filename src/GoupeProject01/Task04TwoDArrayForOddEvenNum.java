package GoupeProject01;

public class Task04TwoDArrayForOddEvenNum {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integer type where you will store
			odd and even numbers. Develop a program which will
			identify/print the even numbers only. */
		
		int[][] num= {{6,13,18,3},
					  {3,1,10},
					  {2,17,22}};
		
		
for(int i=0; i<num.length; i++) { // first iteration 0<3 , second iteration 1<3 and so on..
			
			for(int j=0; j<num[i].length; j++) {
				
				if(num[i][j]%2==0) {
					
				System.out.println(num[i][j]);
					
				}
			
			}
		}
		
	}

}
