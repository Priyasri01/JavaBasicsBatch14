package practiceTask;


public class ArrayTaskReverseValue {
	
	public static void main(String[] args) {
	/*
	 * Create an array to store char values and then print those in reverse order
	 */
		
	char[] letter = {'A','B','C','D','E'}; // size =5
	
	for(int i =letter.length-1; i>=0; i--)  {  /*note we are subtracting letter.length -1 , because we are iterate for loop based on 
												the size of the array ,if we put without subtract it will be 5 we will get run time error , "Index 5 is outofbond" .
		 										so we are subtract 1 from letter.length which is 5-1 =4 , so now 4>=0 
		 										it will enter loop and execute letter array elements which is in 4 index value , that is 'E' */
		System.out.print(letter[i] + " ");
		}

}
}

