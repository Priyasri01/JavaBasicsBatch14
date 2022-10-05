package AccessModifireHomeWork;

public class HomeWorkArray01 {
	
	
	
   /* Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
     */
	
	int[] num= {10,20,30,40};
	
	
	int method(int[] num) { //  as per the requirement we created default method access modifier, because default access modifier will access within the same package.
		
		int sum=0;
		
		for(int i=0;i<num.length;i++) {
			
			sum+=num[i];
		}
		return sum;
	}
	

	public static void main(String[] args) {
		
		HomeWorkArray01 obj= new HomeWorkArray01();
		
		int[] num= {10,20,30,40};
		
		System.out.println(obj.method(num));
		
		 //System.out.println(obj.method(new int[] {10,20,30,40})); // note we can directly provide the argument in array by this way.this is one way we provide the result. but note we need to put "new" word
        //System.out.println(obj.method(obj.num)); // note since we are not passing the argument inside the method , because we already assing default variable for array "num" in line 11,so we just calling them.

	}
}
