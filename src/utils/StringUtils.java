package utils;

public class StringUtils {
	
public	void printAllIndexes(String str, char charToSearch) {  /*note inside () passing the string name , 
													so it will know where to search and we passing the character name ,
													so that it will look for the particular character from particular string.
													note the "str" , "c" are reference variable name it can be any. */
		
		
		for(int i =0; i<str.length(); i++) {
			
			if(str.charAt(i)== charToSearch) { //c is variable name we provided in line 5
				
				System.out.println(str.charAt(i)); // this will show the value that exist in the particular index
				System.out.println(i); // this will show the index number we character was stored.
			
			}
			
			
		}
	}


}
	
	

