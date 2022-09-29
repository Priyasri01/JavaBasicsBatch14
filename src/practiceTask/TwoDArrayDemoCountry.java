package practiceTask;

public class TwoDArrayDemoCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] countries= {
				
								{"USA" , "Canada"}, //1 array/row and the  index 0
								{"peru", " Brazil","Colombia", "Ecudaor"}, //2 nd array/row the index is 1 
								{"Ethipoa", "Egyupt", "Kenya"}, //3 rd array/row the index is 1 
								{"Germany", " Turkiye", " Moldova", "Ukranie"},//4 th array/row the index is 1 
								{" Kazakhstan","Afhanistan", " Korea" },//5th array/row the index is 1 
							};
		
		System.out.println(countries.length); //output ->5 total# arrays/rows , because  in 2D array it will calculate number of individual array inside the big array which is countries 
		
		int elof1arr= countries[0].length; //output->2  meaning go inside the first array and tell me how many elements.
		System.out.println("# of elements from 1 st array " + elof1arr);
		
		int elementOf2Array = countries[1].length;//output->4  meaning go inside the first array and tell me how many elements.
        System.out.println("# of elements frome 2 Array: "+elementOf2Array);
        System.out.println();

        System.out.println("--> belwo are Getting all values for 2D Arrays by using for loop<--");
        System.out.println();

        
      //outer loop take care row and inner loop  take care the cloum			
        for(int row=0; row<countries.length; row++) { //note: outer loop iterate row
            System.out.println();
            for(int col =0; col<countries[row].length; col++) { //inner loop iterate column of elements  of that particular array
            												/*in here we typed [row], so that it will tell in that particular row how many 
            												   elements or we can say how many column. for first iteration countries[0].length which is 2
              													and Second iteration countries[1] .length which is 4 and so on..*/

                System.out.print(countries[row][col]+" ");  // first iteration[0][0]--> output is "usa"  and second iteration[0][1]  --->output is "Canada"  and so on...

            }

            System.out.println(); //for create empty line
            
           }
        
        System.out.println(" ------- getting all values from 2d array using for each loop -----");
        //Syntax : for(data type variable Name: name of the array)
        for (String[] country : countries) { //note: outer loop iterate row
        									/* note we mentioned 1D array ,
        									because in will check one array in iteration 
        									so that why we put string [] */
        									
        	for (String c : country) {  //inner loop iterate column of the particular array

                if (c.equals("Kazakhstan")) { 
                    System.out.println(c+ " is my home country");
                } else {
                    System.out.print(c + "  ");
                }
              
            }
            System.out.println();
        }
        
	}

}
