package reviewClass03;

import java.util.Scanner;

public class ScannerLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter if you are comfortable with" + 
		"java logical operators now");
		
		boolean goodWithOp= in .nextBoolean();
		
		
		if(!goodWithOp){ //it reverse the conditon , if i type false this if  block will excute
			
			System.out.println("Do some more research solve some repls and take some ");
		}
	}

}
