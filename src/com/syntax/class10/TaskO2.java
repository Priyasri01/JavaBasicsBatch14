package com.syntax.class10;

public class TaskO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades. 
		 * Then your program should print name of the students and their grade that has A and B grade
		 */
		
		String [][] name = { {"priya", "peter", "Archanan","hari"}, 
								{"A", "B", "C", "D"}
							};

		System.out.println(name[0][0] + " = " + name[1][0]);
		System.out.println(name[0][1] + " = " + name[1][1]);
	}

}
