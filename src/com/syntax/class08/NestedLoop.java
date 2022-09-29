package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1; i<3; i++){ //outer loop , it control inner loop 
				System.out.println("Hello"); 
				
			for(int j=1;j<=3;j++){ //inner loop , depends on outer loop
				System.out.println("bye");
			}
		}
			System.out.println("----------------------------------------------------------");
			
			for(int i=0 ;i<=2; i++) {
				
				for(int j=1; j<4; j++ ) {
					System.out.println(i + " " + j);
					
				}
			}
			System.out.println("end of the code");
		}

	}


