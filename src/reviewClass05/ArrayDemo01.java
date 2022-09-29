package reviewClass05;

import java.util.Arrays;

public class ArrayDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//not used in the real life most of the  times.
		//one of the ways to create an array.
		String[] names= new String[] {"Huma","Janel","Anna"};
		
		//System.out.println(name1); --it will give error
		//System.out.println(name1); --- it will give error
		System.out.println(names[2]);
		
		String[] dresses= {"Pink Dress","Cocktail","Summer Dresses", "night dress", "pencil dress"};
		
		System.out.println(dresses.length);
		
		for(String dress: dresses) {
			
			System.out.println(dress);
		}
		
		System.out.println("*******************************************");
		
		//Print all the elements of an array without a loop , but not often practice
		System.out.println(Arrays.toString(dresses));

	}

}
