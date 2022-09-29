package practiceTask;

public class ArrayTaskSumOfAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 3. Create an array on integers and calculate 
		 * the sum of all elements in an array 
		 * 
		 */
		
		int[] name= {10, 20, 50, 90, 100};
		
		int sum=0;
		
		for(int i=0 ; i<name.length ; i++) {
			
			sum+=name[i]; // sum=sum+i
		}
		System.out.println(sum);
		
		System.out.println("********************************Enhance for loop*********************************");
		
		sum=0;  /*note: we are reassigning the sum value to zero ,
		because last sum value is 270 in line 22 .so just we will keep the array as it in line 14 and will do enhance for loop.*/
		
		for(int nam : name) {
			
			sum+=nam;
		}
		System.out.println(" The sum of the number in this array is:" +sum);
}
	
}
