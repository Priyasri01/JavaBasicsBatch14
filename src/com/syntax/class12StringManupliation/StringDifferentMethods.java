package com.syntax.class12StringManupliation;

import java.util.Arrays;

public class StringDifferentMethods {

	public static void main(String[] args) {
		
		System.out.println("**************************************NextMethodlength() *******************************************************");
		
		String str =new String("Java"); // this is the proper way of creating an object. but mostly in particle  we use line 8 instead of this  line 7.
		
		String name="Priyasi Murugesan Hariharan";  /*this is the common way we use .
													it's simpler and shorter way provided by Java Creators to make our life little easier. 
													But this one only works for string and wrapper classes*/ 
		
		System.out.println(str.length());  /*  It counts the number of character in a string which includes the space.
		this method will provide the length of the sequence of characters represented by this object "Str" */
		
		
		
	System.out.println(name.length()); // note  this one and line 9 will provide the same length
	
	if(name.length()>15) {
		
		System.out.println("Name can't be more than 15 Charters");
	}
	
		System.out.println();
		System.out.println("**************************************NextMethodUppercase() *******************************************************");
		

		String str1="dna";
		
		
		System.out.println(str1.toUpperCase()); // if we need to convert something from lower case to upper case , then we can use this method.
		
		System.out.println();
		System.out.println("**************************************NextMethodlowerCase() *******************************************************");
		
		String str2 ="JAVA";
		
		System.out.println(str2.toLowerCase());// if we need to convert something from lower case to upper case , then we can use this method.
		
		System.out.println();
		System.out.println("**************************************NextMethodconcat() *******************************************************");
		
		String firstName="Olena";
		String lastName="Dudka";
		System.out.println(firstName +" " + lastName); //Mostly this is used 
		System.out.println(firstName.concat(" ").concat(lastName)); // both line 42 & 43 will give the same output.
		
		System.out.println();
		System.out.println("**************************************NextMethodisEmpty() *******************************************************");
		
		String str3="";
		System.out.println(str3.isEmpty()); // result true, because it's empty. "isEmpty" will return true if the string is empty.
		String str4= " "; /* note inside the " " everything is matter , even space have value , now if we check isEmpty(), 
							it will be false . Because space is also treat as characters so we will get false.*/
		System.out.println(str4.isEmpty());
		
		System.out.println();
		System.out.println("**************************************NextMethodisBlank() *******************************************************");
		
		//System.out.println(str4.isBlank()); // "isBlank" method does not count the space, so it will return false. we will get error because the version 8.
		
		System.out.println();
		System.out.println("**************************************NextMethodtrim() *******************************************************");
		
		String str5 =" i love java ";
		System.out.println(str5);
		System.out.println(str5.trim()); // this method will remove the space before and after the string but not the space  which are present in between words.
		
		System.out.println();
		System.out.println("**************************************NextMethodstartsWith() *******************************************************");
		
		String str6="Java is Very easy";
		//this method checks if a string starts with a specific letter or word.
		System.out.println(str6.startsWith("Java")); /* this method will return in  boolean , so it will check is this start with "Java" --result "true".
		 											 And also instead of words we can check the characters also.*/
		
		System.out.println();
		System.out.println("**************************************NextMethodendsWith() *******************************************************");
		//this method checks if a string ends with a specific letter or word.
		System.out.println(str6.startsWith("j")); // will return false, because the string  doesn't have j in the end.
		
		System.out.println();
		System.out.println("**************************************NextMethodcontains() *******************************************************");
		//this method will check if a string contains a specific letter or word.
		System.out.println(str6.contains("very")); // we are using method changing , meaning have multiple method
		
		System.out.println();
		System.out.println("**************************************NextMethodChaining() *******************************************************");
		
		System.out.println(str6.toLowerCase().contains("very")); /* we are using here is called method chaining ,
																	meaning it helps us call multiple methods on a single line one method after an other.*/
		
		String str7="SHAH";
		String str8="Shah";
		String str9= new String("Shah");
		

		
		if(str7.equals("Shah")) { //note equals method will check the content/value inside the reference variable. whereas "==" it check the box  label. so that's why  we are using .equals in string.
			
			System.out.println("I found it");
		}else {
			
			System.out.println("I couldn't found it");
		}
		System.out.println();
		System.out.println("**************************************NextMethodIgnoreCase() *******************************************************");
		
		/*
		 * equals checks if two Strings are exactly the same with exact same case(like uppercase/lowercase)
		 *  equalsIgnoreCase checks if two string are exactly the same but does not care about the case. it basically will ignore the case sensitive.
		 */
		
		if(str7.equalsIgnoreCase("shah")) {
			
			System.out.println("I found it with equalsIgnoreCase");
		}
		
		System.out.println();
		System.out.println("**************************************NextMethodCharAt() *******************************************************");
		
		String str10= "I Love java Programming"; 
		
		System.out.println(str10.charAt(0)); // this will return only the "0" index value, in case we need to get all the character from the  string then we have to use for loop line 133.
		
		/*charAt Method returns us the character at a specific index.line 127
		
		 */
		
		for(int i=0 ; i<str10.length(); i++) {
			
			/* we are using this if condition , to ignore the space between the word. basically print only the character not space.
			 *  and also note we given == , because char is primitive data type
			 */
			
			if( !(str10.charAt(i)==' ')) { // we are using this if condition , to ignore the space between the word. basically print only the character not space. and also note we given == , because char is primitive data type
				
				System.out.print(str10.charAt(i)); 
				
			}
		}
		
		System.out.println();
		System.out.println("**************************************NextMethod.toCharArray() & interview Question *******************************************************");
		
		//interview Question: count how many times the "m" appeared in a given string.
		
		String str11= "I Love today class";
		
		/*
		 * This method will convert string to Ar
		 * ray of char.
		 */
		
		char[] charName = str11.toCharArray();  // char[] reference variable name = variable name ("str11")which we need to convert . metho()
		
		int count=0;
		for(int i=0; i<charName.length; i++) {
			
			if(charName[i]=='s') {
			
			count++;
			
			}
		}
		System.out.println("letter s has appread " +count + " Times");  
		
		
		System.out.println();
		System.out.println("**************************************NextMethod.tostring() *******************************************************");
		
		System.out.println(Arrays.toString(charName)); //  it basically return the  value in array format
		
		
		System.out.println();
		System.out.println("**************************************NextMethod.indexOf() *******************************************************");
		
		String str12 = "I am always consfused, just kidding";
		
		System.out.println(str12.indexOf("a")); // this will return index number  only for first Occurrence of "a". even if the same letter appear in the string. it will read only first appearence.
		System.out.println(str12.indexOf("s"));
		System.out.println(str12.indexOf(" ")); //it will search for the space. it can only search for first Occurrence.
		
		
		System.out.println();
		System.out.println("**************************************NextMethod.substring() *******************************************************");
		
		/*
		 * Substring() gives you smaller string from a string we can start the starting part to this method and it will return us the substring from the index.
		 * 
		 */
	
		System.out.println(str12.substring(2)); //leave first two letter and print everything from the string.
		System.out.println(str12.substring(5, 11)); // we can give/define  str index and end index . And  note starting index will include whereas end index will exclude.
		
		System.out.println();
		System.out.println("**************************************NextMethod.valueOf() *******************************************************");
		
		int num = 123456789; //as we know all the above method are string method. so in case if we need to get specify number then we will convert this number to string , then we can do substring method.
		String numStr =String.valueOf(num);  // this method will convert int to string by using valueOf.
		System.out.println(numStr.substring(2, 8));
		num=Integer.parseInt(numStr); // now converting that staring back to Int . new name = Integer.parseInt(string name which we need to convert back to int.
		System.out.println(num);
		
		System.out.println();
		System.out.println("**************************************NextMethod.replace() *******************************************************");
	
		String str13 = "Batch 14 is good ";
		
		System.out.println(str13.replace("good", "Excellent")); // this method will repalce the value . first " "  is define what  word need to replace. second " " will define what is the word need to be replace.
		
		System.out.println(str13.replace("B", "A")); // note we can replace the letter also.
		
		System.out.println();
		System.out.println("**************************************NextMethod.replaceAll() *******************************************************");
	
		String str14 = "Batch 14 is good 81234823!@##%#^ ASAKBSAKAJSBN kajbjakfdnb"; //replaceAll it takes a pattern  and replace all the characters that follow that pattern
		System.out.println(str14.replaceAll("[a-z]", "#")); // in here we are java to remove all the small letter from a to z and replace to "#" .output will see all instead of a-z we will see '#'.
	
	}

}
