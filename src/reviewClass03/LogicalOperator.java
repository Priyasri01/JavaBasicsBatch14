package reviewClass03;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean programmer=false;
		boolean manualTester=true;
		boolean knowFramework=false;
		
		if(programmer && manualTester && knowFramework) {
			
			System.out.println("you can be an automation engineer");
		}else {
			
			System.out.println("you must know a programming language and manual testing " + " to be an automation engineer");
		}

	}

}
