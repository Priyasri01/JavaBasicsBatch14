package reviewClass03;

public class NestedIfVsLogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean programmer=true;
		boolean manualTester=false;
		boolean knowFrameWork=true;
		
		if(programmer) {
			System.out.println(" yaay you are a programmer lets chekc if you konw manual testing as well");
            if(manualTester) {

                if(knowFrameWork) {
                    System.out.print("You can be an automation engineer");
                }else {
                    System.out.println("You need to know a framework as well ");
                }
                }else {
                    System.out.println("You need to know Manual testing as well");
                }
            }else {
                System.out.println("You need to be a programmer as well");
            }


    }
		

	}


