package com.syntax.class10ObjectClass;

public class Student { // a class is just template 
	
	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	void study() {
		
		System.out.println("Student is studying");
	}
	
	void deleteMessages() {
		
		System.out.println("Deleting message from discord");
	}
	
	void eat() {
		
		System.out.println("Eating Pizzzzzzzzzzzzzza");
	}

	public static void main(String[] args) {
		Student fraiObject= new Student(); //created a boject
		
		fraiObject.name= "Priyasi"; //using that object he is accessing  attributes
		fraiObject.id="123";
		fraiObject.age=22;
		
		System.out.println(fraiObject.name);
		System.out.println(fraiObject.age);
		fraiObject.deleteMessages();
		
		
		Student student2= new Student();
		student2.name="Asma";
		student2.age=16;
		student2.weight=30;
		student2.gender='F';
		System.out.println(student2.name);
		student2.eat();
		
		
		
	}
}
