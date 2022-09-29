package com.syntax.class10ObjectClass;

public class PhoneTester {

	public static void main(String[] args) {
		
		/*
		 *In case if we create a object class and whose class is in another class 
		 *which is present inside the same package then we can just call the method .
		 *but in case if the class  is outside the package then need to import. like how we do for scanner class.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
		 */
 //note: the reason we are separating the class and object class is because any body can call the method from anywhere.

		Phone Iphone = new Phone(); //creating "mobile" object for "Phone" class
		
		Iphone.make="Apple";
		Iphone.model="Iphone 14 Pro Max";
		Iphone.year=2022;
		Iphone.storage= 128;
		Iphone.makeCall(); // we call the method from Phone class to use it.
		
		  //New Phone()==> to create the objects
		Phone samsungPhone = new Phone();
		
		samsungPhone.model="S22 Ultra";
		samsungPhone.make="Samsung";
		samsungPhone.year=2022;
		samsungPhone.makeCall();
		
		
		
		

	}

}
