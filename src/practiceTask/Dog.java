package practiceTask;

public class Dog {
	
	/*
	 * Create a Dog Class and create 3 different objects of it: 
	 * Husky, Bulldog, Labrador  with specific  attributes and behaviors.
	 */
	
	String breed;
	String color;
	String size;
	String lifeSpan;
	
	void diet() {
		
		System.out.println("-Less food than some similarly size breeds");
	}
	
	void personality() {
		
		System.out.println("-Labs are intelligent , with a warm, friedly temperament that makes them ideal for first-time owners");
		
	}
	
	void affection() {
		
		System.out.println("-AS an affectionate breed, bulldog show their love with a variety of behaviors.This includes Wagging their tails,licking, cuddling,and following you around.");
		
	}
	public static void main(String[]args) {
		
		Dog  name1= new Dog();
		
		name1.breed= "Siberian Husky";
		name1.color="Balck & White";
		name1.size="2o to 30 lb";
		System.out.println("-This " + name1.breed + " Serious tranning is ansolutely essential to help focus their energy and this breed requires : ");
		System.out.println();
		name1.diet();
		
		System.out.println("*******************************************************************");
		
		
		Dog name2 = new Dog();
		
		name2.breed="Labrador";
		name2.color="Black, chocolate, yellow";
		name2.size="large";
		name2.lifeSpan=" 10 -12 yrs";
		System.out.println("-Breed name "+ name2.breed);
		System.out.println();
		name2.personality();
		
		System.out.println("*******************************************************************");
		
		
		Dog name3= new Dog();
		
		name3.breed= "Bulldog";
		name3.color="Red, beige";
		name3.lifeSpan="8-12 yrs";
		System.out.println("-Breed name "+ name3.breed + " and their life span is "+ name3.lifeSpan);
		System.out.println();
		name3.affection();
		
		
		
	}
	

}
