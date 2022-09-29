package reviewclass04;

public class ForLoopDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=10;i>=0; i=i-2 ) {
			
			System.out.println(i);
			
			// out put 9 5 1
		}
 for(int i=9 ; i>=1; i-=4) {
	 
	 System.out.println(i);
 }
 

 // 1 3 7 9
 for(int i=1 ; i<=9 ; i+=2) {
	 
	 if(i!=5) {
	 System.out.println(i);

	 
 }
 
	}
System.out.println("***********************************another way***************************************");

// 1 3 7 9
for(int i=1 ; i<=9 ; i+=2) {
	 
	 if(i==5) {
	 continue;

	 }
	 System.out.println(i);
}
}
}
