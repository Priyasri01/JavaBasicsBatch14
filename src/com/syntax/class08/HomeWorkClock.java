package com.syntax.class08;

public class HomeWorkClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create a digital clock using nested loops

		If you can, try to have a clock that would show 2 digits for hour and 2 digits for minutes */
		
		for(int hr=0; hr<=1;hr++) {
			
			for(int hr1=0 ; hr1<=12 ; hr1++) {
				
				
				for(int hr2=13 ; hr2<=23 ; hr2++) {
			
		for(int min=0; min<=59;min++) {
			
			if(hr1>0 && hr1<=9) {
				System.out.println("0" + hr + ":"  +"0" + min);
			}else if(hr2>=10 && hr<=23 && min<=9) {
			System.out.println(hr +  ": "  + "0" +min );
				}

		
			}
		System.out.println("-----------------------------------------------------------------------");
		
		}

	}
}
}
}



