package reviewClass03;

import java.util.Scanner;

public class YesOrNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Are you form batch 14");
		String batch14= in .next();
		
		if(batch14.equalsIgnoreCase("yes"))
        {
            System.out.println("You are amazing");
        }
        else 
        {
            System.out.println("You are good");
        }
		
		

	}

}
