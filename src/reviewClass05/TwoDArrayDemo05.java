package reviewClass05;

public class TwoDArrayDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//line item 10 to 12 is one D array
		String[] individualsInRoom1= new String[] {"Sabej","Shah","Mina"};
        String[] individualsInRoom2= new String[] {"Roman","Mina"};
        String[] individualsInRoom3= new String[] {"Asad","Priyasri","Ali"};
       
        //   an 2D array that will store 3 oneD arrays , since we are taking the same  above values for this 2D Example. that why we mentioned "3" inside []
        String [][] rooms=new String[3][]; // Note: we mentioned empty [], in some index we might have elements some don't . so that' s why we live it as empty.


        rooms[0]=individualsInRoom1; //take all the elements from individualInRoom1 and stored in rooms[]
        rooms[1]=individualsInRoom2;
        rooms[2]=individualsInRoom3;

        System.out.println(rooms[2][1]);

	}

}
