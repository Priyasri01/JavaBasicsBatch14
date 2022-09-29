package com.syntax.class09;

public class ClockWithNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 for (int h = 0; h < 24; h++) { //control hours

	            for (int m1 = 0; m1 <= 5; m1++) { //control first  digit of minute 0 to 5

	                for (int m2 = 0; m2 <= 9; m2++) { //cotrol sceond digit of minute 0 to 9

	                    if (h < 10) {
	                        System.out.println("0" + h + ":" + m1 + m2);
	                    } else {
	                        System.out.println(h + ":" + m1 + m2);
	                    }
	                }
	            }
	}

}
}