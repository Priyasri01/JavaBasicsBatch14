package GoupeProject01;

public class Task09MaxAndMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Maximum and minimum number in the array?
		
		int[] num= {300,2000,180, 900};
		int  maxNum=num[0]; //just assuming num[0] is maximum
		int minNum=num[0];//just assuming num[0] is minimum
		
		
		for(int i=0; i<num.length; i++) {
			
			if(num[i]>maxNum) {
				maxNum=num[i];
				
			}else if(num[i]<minNum) { 
				minNum=num[i];
				
			}
		}
System.out.println( "MaxNum -->" + maxNum);
System.out.println("MinNum--> " + minNum);

	}

}
