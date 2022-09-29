package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

 int day=4;
 
 if(day==1) {
     System.out.println("Monday");
 }else if (day==2) {
     System.out.println("Tuesday");
 }else if (day==3) {
     System.out.println("Wednesday");
 }else if (day==4) {
     System.out.println("Thursday");
}else if (day==5) {
    System.out.println("Friday");
}else if (day==6) {
    System.out.println("Saturday"); 
}else if (day==7) {
    System.out.println("sunday");
} else {
    System.out.println("Please enter a valid day number(1-7");
}
 System.out.println("-------------------------------------------------------------");
 
 	String name;
 	
 	switch(day) {
 	case 1:
 			name="Monday";
 			break;  // we need to put break; so that once it find the match it will come out from switch condition.
 	case 2:
 		  name="Tuesday";
 		  break;
 	case 3:
 		name="Wednesday";
		  break;
 	case 4:
 		name="Wednesday";
		  break;
		  
 	case 5:
 		name="Wednesday";
		  break;
 	case 6:
 		name="Wednesday";
		  break;
 	case 7:
 		name="Wednesday";
		  break;
		  
		  default:
			  name="Invalid";
 			}
 System.out.println(name);
}
}


