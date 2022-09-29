package reviewClass03;

public class LogicalOperNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String country="Korea";
		
	/*(country.equals("Turkiye")|| country.equals("Japan")|| country.equals("Spa" )) {
			
			System.out.println("welcome to USA");
		} */
		
		if(!country.equals("Korea")) {
			
			System.out.println("welcome to USA");
		}else {
			System.out.println("sorry u can't enter USA");
		}
	}

}
