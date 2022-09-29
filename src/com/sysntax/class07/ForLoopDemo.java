package com.sysntax.class07;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we can use for loop , if i know how many time do need to repeat the block of code.
		
		for(int i=1 ; i<=5 ; i++) { /*only one time intialization will happen i=5 , then it will check the condition then it execute 
										the syso code then only it will do increment */
			
			System.out.println("Hello");
		}

		System.out.println("**************************************");
		
		//print number from 1 to 20
		
		for(int i=1; i<=20 ; i++ ) {
			
			System.out.println(i+ " ");
		}
		System.out.println("**************************************");
		
		//print number from 30  to 10
		for(int i=30; i<=10 ; i-- ) {
			
			System.out.println(i+ " ");
		}
		System.out.println("**************************************");
for(int i=0; i<=10 ; i+=2 ) {
			
			System.out.println(i+ " ");
		}	

for (int i=10 ; i<=25 ; i+=5) {
	System.out.println(i+ " ");
	
}
 int sum=0;
 for(int i=1;i>=6; i++) {
	 
	 sum+=i ;
	 }
 System.out.println(sum);
 

	}

}
