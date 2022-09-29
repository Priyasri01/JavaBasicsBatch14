package practiceTask;

public class Phone {
	
	/*
	 * Create a Class “Phone”. 
	 * Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.
	 */
	//create attributes and Methods
	String name;
	String  model;
	String color;
	String battery;
	int size;
	boolean famous=true;
	
	void popular() {
		
		if(famous) {
			
			System.out.println( "Iphone is most popular in Bussiness sector");
		}else {
			
			System.out.println("Teen perferred Phone is Samsung");
			
	}
				
				}
	
	void PhonFeatures() {
		
		System.out.println("Apple's 2022 iPhones feature satellite emergency services, crash detection, an A15 chip, camera improvements, and there are more.");
	}
	
	
	public static void main(String[]args) {
		
		Phone phone1= new Phone(); // created an object for "Phone" class.
		
		phone1.name="Iphone";
		phone1.model="14 Pro Max";
		phone1.famous=true;
		phone1.color="Purpel";
		System.out.println(phone1.name + ":");
		phone1.popular();
		
		System.out.println("*********************************************************");
	
		Phone phone2= new Phone();
	   
	   phone2.name="Samsung";
	   phone2.model="Galaxy Zfilp";
	   phone2.famous=false;
	  

       System.out.println(phone2.name + ":");
       
       	phone2.popular();
	}

}
