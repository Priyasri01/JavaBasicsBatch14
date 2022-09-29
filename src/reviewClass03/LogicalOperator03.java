package reviewClass03;

public class LogicalOperator03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double saving= 200000;
		boolean freeTime=true;
		String season="Summer";
		
		if(saving>100000 && freeTime && season.equalsIgnoreCase("summer")) {
			
			System.out.println("lets go to Bora Bora");
		}else {
			
			System.out.println("I need time and money");
		}

	}

}
