package com.syntax.class08;

public class Breakeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break - break the loop and it usually used inside some type of conditions
		for(int i=1; i<5; i++) {
			System.out.println("Hello");
			
			if(i==3) {
			break;  //break will break the loop and it usually used inside some type of condtion . mostly will specify inside the if statment
			}
		}
  boolean hungry=true;
  			while(hungry) {
  				
  				System.out.println("Give me food");
  				break;
  			}
		System.out.println("End");
	}

}
